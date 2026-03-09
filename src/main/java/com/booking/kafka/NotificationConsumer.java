package com.booking.kafka;

import com.booking.model.BookingEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    @KafkaListener(topics = "booking-topic", groupId = "notification-group")
    public void consume(BookingEvent event) {

        System.out.println("Sending notification for booking " + event.getBookingId());

        sendEmail(event);
    }

    private void sendEmail(BookingEvent event) {

        System.out.println("Email sent for movie " + event.getMovieName());
    }
}
