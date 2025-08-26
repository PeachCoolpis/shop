package com.shop.entity;


import com.shop.entity.embed.Address;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "DELIVERY")
public class Delivery {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DELIVERY_ID")
    private Long deliveryId;
    
    @Column(name = "STATUS")
    private String status;
    
    @Embedded
    private Address address;
}
