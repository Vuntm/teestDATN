package com.example.l.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "product")
public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String product_code;
    private String product_name;
    private String brand_code;
    private String category_code;
}
