package com.example.onlinevideo;

import com.example.onlinevideo.Mapper.AccountMapper;
import com.example.onlinevideo.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OnLineVideoApplicationTests {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private Account account;

    @Test
    public void selectAccountAll(){
        List list=accountMapper.findAll();
        System.out.println(list);
    }

    @Test
    void contextLoads() {
    }

}
