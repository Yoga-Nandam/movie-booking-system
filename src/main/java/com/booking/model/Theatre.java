package com.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * JPA entity representing a theatre operated by a partner.
 * Belongs to the domain layer and is persisted through the `TheatreRepository`.
 */
@Entity
public class Theatre {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String city;

    @ManyToOne
    private Partner partner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }
}
