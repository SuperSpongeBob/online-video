package com.example.onlinevideo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Account {
    private Integer id;
    private String username;
    private String password;
}
