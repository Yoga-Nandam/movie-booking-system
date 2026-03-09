package com.booking.service;

import com.booking.model.Payment;
import com.booking.model.PaymentRequest;

public interface PaymentService {
    Payment processPayment(PaymentRequest paymentRequest);
}
