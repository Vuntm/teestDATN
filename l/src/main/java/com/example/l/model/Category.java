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
@Table(name = "category")
@Getter
@Setter
public class Category {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String category_code;
    private String category_name;
    private String note;
}
