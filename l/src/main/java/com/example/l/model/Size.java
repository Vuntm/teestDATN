package com.example.l.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "size")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Size {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private int size_code;

    private int size;
}
