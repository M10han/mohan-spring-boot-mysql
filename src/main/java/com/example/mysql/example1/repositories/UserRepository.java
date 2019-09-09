package com.example.mysql.example1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.example1.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
