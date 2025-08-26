package com.shop.entity;

import com.shop.entity.embed.Address;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long memberId;
    
    @Embedded
    private Address address;
    
    @Column(name = "name")
    private String name;
    
}
