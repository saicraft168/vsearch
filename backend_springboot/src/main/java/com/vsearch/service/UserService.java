package com.vsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsearch.entity.UserEntity;
import com.vsearch.repository.UserRepository;


/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
    /**
     * ユーザー情報 Repository
     */
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserEntity> searchAll() {
        // ユーザー情報を全取得
        return repository.findAll();
    }
}
