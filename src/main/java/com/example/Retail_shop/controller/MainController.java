package com.example.Retail_shop.controller;


import com.example.Retail_shop.dal.DataAccessLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/unauthorized")
public class MainController {
    private DataAccessLayer dataAccessLayer;
    @Autowired
    public MainController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }

}
