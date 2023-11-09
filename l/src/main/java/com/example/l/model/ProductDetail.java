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
@Table(name = "product_detail")
@Getter
@Setter
public class ProductDetail {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Id
    private String product_detail_code;
    private String product_detail_name;
    @ManyToOne
    @JoinColumn(name = "product_code", referencedColumnName = "product_code")
    private Product product;

//    @ManyToOne
//    @JoinColumn(name = "begin_date_code",referencedColumnName = "begin_date_code")
//    private BeginDate begindate;

    @ManyToOne
    @JoinColumn(name = "size_code",referencedColumnName = "size_code")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "color_code",referencedColumnName = "color_code")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "material_code",referencedColumnName = "material_code")
    private Material material;

//    @ManyToOne
//    @JoinColumn(name = "category_code",referencedColumnName = "category_code")
//    private Category category;

//    @ManyToOne
//    @JoinColumn(name = "brand_code",referencedColumnName = "brand_code")
//    private Brand brand;



    private Integer quantity;
    private Double import_price;
    private Double price;
    private String describe;

    @ManyToOne
    @JoinColumn(name = "supplier_code",referencedColumnName = "supplier_code")
    private Supplier supplier;

    private int status;

}
