package com.example.checkout.repository;

//import com.example.checkout.configuration.LoadBalancerConfiguration;
import com.example.checkout.model.dto.Product;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "products-service")
//@FeignClient(name = "products-service2", url = "http://localhost:8080")
//@LoadBalancerClient(value="products-service", configuration = LoadBalancerConfiguration.class)
public interface FeignProductRepository {

    @GetMapping("/products")
    Product getProductById(@RequestParam String productId);
}
