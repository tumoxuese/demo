package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Account;
import com.example.service.AccountService;

@RestController
public class HelloController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "getUser/{id}",method = RequestMethod.GET)
    public String hello(@PathVariable int id) {
        return accountService.Sel(id).toString();
    }

}