package com.example.service;

import com.example.entity.Account;
import com.example.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account Sel(int id){
        return accountMapper.Sel(id);
    }
}
