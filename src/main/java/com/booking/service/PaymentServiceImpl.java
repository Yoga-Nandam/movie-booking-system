package com.booking.service;

import com.booking.model.Payment;
import com.booking.model.PaymentRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements  PaymentService{
    @Override
    public Payment processPayment(PaymentRequest request) {
        // Payment yet to be implemented.

        Payment payment = new Payment();

        payment.setBookingId(request.getBookingId());
        payment.setAmount(request.getAmount());
        payment.setStatus("SUCCESS");
        payment.setTransactionId(UUID.randomUUID().toString());
        return payment;
    }
}
