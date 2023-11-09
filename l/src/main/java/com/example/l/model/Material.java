package com.example.l.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "material")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String material_code;

    private String material_name;
}
