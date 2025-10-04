package com.vsearch.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UserEntity {
    
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * メール
     */
    @Column(name = "email")
    private String email;

    /**
     * ハッシュ済みパスワード
     */
    @Column(name = "hashed_password")
    private String hashedPassword;

    /**
     * 登録日時
     */
    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    /**
     * 更新日時
     */
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;
}
