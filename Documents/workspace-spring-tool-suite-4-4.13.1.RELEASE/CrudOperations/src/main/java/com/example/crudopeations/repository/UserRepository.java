package com.example.crudopeations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudopeations.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
