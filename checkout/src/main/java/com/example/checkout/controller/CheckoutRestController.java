package com.example.checkout.controller;

import com.example.checkout.model.Checkout;
import com.example.checkout.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkout")
public class CheckoutRestController {

    private CheckoutService checkoutService;

    public CheckoutRestController(CheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-From") String requestFrom) {
        System.out.println("Request from: " + requestFrom);
        if(requestFrom.equals("gateway"))
            return checkoutService.buildCheckout(productIds);
        else
            return null;

    }
}
