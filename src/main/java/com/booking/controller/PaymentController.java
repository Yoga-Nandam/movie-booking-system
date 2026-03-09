package com.booking.controller;

import com.booking.model.Payment;
import com.booking.model.PaymentRequest;
import com.booking.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public Payment processPayment(@RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }
}
