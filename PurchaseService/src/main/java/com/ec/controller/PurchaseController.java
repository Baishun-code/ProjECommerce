package com.ec.controller;

import com.ec.entity.ResponseV0;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PurchaseController {

    public ResponseV0 createPurchaseOrder(){
        return null;
    }

    public ResponseV0 addPurchaseCart(){
        return null;
    }

    public ResponseV0 payOnOrder(){
        return null;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
