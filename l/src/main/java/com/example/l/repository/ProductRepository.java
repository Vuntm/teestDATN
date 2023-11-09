package com.example.l.repository;


import com.example.l.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetail, UUID> {
//    @Query(value = "SELECT TOP 10 p.product_detail_name,p.price, STRING_AGG(p.product_detail_code, ',') AS merged_product_codes, MAX(b.begin_date) AS latest_begin_date\n" +
//            "            FROM product_detail p\n" +
//            "            JOIN color c ON p.color_code = c.color_code\n" +
//            "            JOIN size s ON p.size_code = s.size_code\n" +
//            "            JOIN begin_date b ON p.begin_date_code = b.begin_date_coquande\n" +
//            "            GROUP BY p.product_detail_name,p.price\n" +
//            "           ORDER BY latest_begin_date DESC",
//            nativeQuery = true)
//    public List<ProductDetail> getListNewArrivalProduct();

}
