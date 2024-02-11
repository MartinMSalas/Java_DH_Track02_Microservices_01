package com.example.checkout.service;

import com.example.checkout.model.Checkout;

import java.util.List;

public interface CheckoutService {
    Checkout buildCheckout(List<String> productIds);
}
