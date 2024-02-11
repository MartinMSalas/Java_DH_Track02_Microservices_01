package com.example.checkout.service;

import com.example.checkout.model.Checkout;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckoutServiceImpl implements CheckoutService {

    private ProductService productService;

    public CheckoutServiceImpl(ProductService productService) {
        super();
        this.productService = productService;
    }
    @Override
    public Checkout buildCheckout(List<String> productIds) {
        double totalAmount = 0.0;
        for (String productId : productIds) {
            totalAmount += productService.getProduct(productId).getPrice();
            System.out.println("Total amount: " + totalAmount);
            System.out.println("Instance ID: " + productService.getProduct(productId).getInstanceId());
        }
        Checkout checkout = new Checkout("1", "http://localhost:8080/checkout/1", Double.toString(totalAmount), List.of("CREDIT_CARD", "PAYPAL"));
        return checkout;

    }

}
