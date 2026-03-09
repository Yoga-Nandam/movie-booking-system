package com.booking.kafka;

import com.booking.model.BookingEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookingEventProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public BookingEventProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendBookingEvent(BookingEvent event) {

        kafkaTemplate.send("booking-topic", event);
    }
}
