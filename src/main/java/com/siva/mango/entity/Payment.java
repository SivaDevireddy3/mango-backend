package com.siva.mango.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Order order;

    private String paymentMethod;
    private String paymentStatus;
    private String transactionId;
}
