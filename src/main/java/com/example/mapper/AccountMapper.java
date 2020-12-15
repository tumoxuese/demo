package com.example.mapper;

import com.example.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    Account Sel(int id);
}
