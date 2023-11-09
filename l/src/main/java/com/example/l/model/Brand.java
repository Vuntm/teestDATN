package com.example.l.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brand")
@Getter
@Setter
public class Brand {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String brand_code;

    private String brand_name;
}
