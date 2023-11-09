package com.example.l.controller;


import com.example.l.model.ProductDetail;
import com.example.l.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/f5store/")
public class ProductController {
    @Autowired
    public ProductService service;

//    @GetMapping("home")
//    private String showTop10(Model model) {
//        List<ProductDetail> listArrivalProduct = service.getAllProduct();
//        model.addAttribute("listArrivalProduct", listArrivalProduct);
//        return "user/homme";
//    }
    @GetMapping(value = "home")
    public ModelAndView discount(Principal principal){
        ModelAndView mv = new ModelAndView("user/homme");
        List<ProductDetail> listArrivalProduct = service.getAllProduct();
        mv.addObject("listArrivalProduct",listArrivalProduct);
        return mv;
    }
}
