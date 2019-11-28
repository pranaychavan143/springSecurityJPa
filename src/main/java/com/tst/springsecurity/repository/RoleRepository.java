package com.tst.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tst.springsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
