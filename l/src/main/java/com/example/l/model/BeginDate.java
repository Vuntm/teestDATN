package com.example.l.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "begin_date")
@Getter
@Setter
public class BeginDate {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String begin_date_code;
    private String begin_date_name;
    private Date begin_date;
}
