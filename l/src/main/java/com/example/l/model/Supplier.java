package com.example.l.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "supplier")
@Entity
public class Supplier extends PersonalInformation {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String supplier_code;

    private String supplier_name;
}
