package com.example.BookManagement.repositories;

import com.example.BookManagement.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByUsername(String username);

//    Optional<UserInfo> findByUserID(Long userID);

}
