package com.example.checkout.service;

import com.example.checkout.model.dto.Product;
import com.example.checkout.repository.FeignProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private FeignProductRepository feignProductRepository;

    public ProductServiceImpl(FeignProductRepository feignProductRepository) {
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public Product getProduct(String productId) {
        return feignProductRepository.getProductById(productId);
    }
}
