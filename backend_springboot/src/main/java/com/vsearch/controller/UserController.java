package com.vsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.vsearch.entity.UserEntity;
import com.vsearch.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ユーザー情報 Controller
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    /**
     * ユーザー情報 Service
     */
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    /**
     * ユーザー情報を取得
     */
    @GetMapping("/list")
    public ResponseEntity<List<UserEntity>> getUsers() {
        List<UserEntity> userlist = service.searchAll();
        return ResponseEntity.ok(userlist);
    }
    
}
