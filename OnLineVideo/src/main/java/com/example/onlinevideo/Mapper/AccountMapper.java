package com.example.onlinevideo.Mapper;

import com.example.onlinevideo.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("select * from account")
    public List<Account> findAll();
}
