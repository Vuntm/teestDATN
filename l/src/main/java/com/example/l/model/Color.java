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
@Table(name = "color")
@Getter
@Setter
public class Color {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String color_code;
    private String color_name;
}
