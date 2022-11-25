package com.example.jdbc_dao.service;

import com.example.jdbc_dao.repository.MyRepository;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public String getProductName(String customerName) {
        return repository.getProductName(customerName);
    }

}
