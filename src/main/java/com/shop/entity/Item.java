package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "ITEM")
public class Item {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long itemId;
    
    private String name;
    
    private Integer price;
    @Column(name = "STOCK_QUANTITY")
    private Integer stockquantity;
    
    private String dtype;
    
    private String artist;
    
    private String etc;
    
    private String author;
    
    private String isbn;
    
    private String director;
    
    private String actor;
}
