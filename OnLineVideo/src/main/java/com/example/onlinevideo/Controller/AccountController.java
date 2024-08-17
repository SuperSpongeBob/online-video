package com.example.onlinevideo.Controller;

import com.example.onlinevideo.Mapper.AccountMapper;
import com.example.onlinevideo.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@Controller
@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:5173")
public class AccountController {
    @Autowired
    private AccountMapper accountMapper;
    @GetMapping("/api/account")
    public List<Account> findAll(){
        return accountMapper.findAll();
    }
}
