package com.tst.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tst.springsecurity.model.User;

public interface UserRepsitory extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
