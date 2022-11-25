package com.example.jdbc_dao.controller;

import com.example.jdbc_dao.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class MyController {
    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping("/fetch-product")
    public String getFetchProduct(@RequestParam String name) {
        return service.getProductName(name);
    }

}
