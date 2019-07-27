package com.byzoro.yjzhdatastorage.controller;

import com.byzoro.yjzhdatastorage.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {
    @RequestMapping("/test")
    public String test(){
         return "123";
    }
}
