package com.example.l.service;

import com.example.l.model.ProductDetail;
import com.example.l.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository service;

    public List<ProductDetail> getAllProduct() {
        return service.findAll();
    }

//    public List<ProductDetail> getListArrivalProduct() {
//        return service.getListNewArrivalProduct();
//    }
}
