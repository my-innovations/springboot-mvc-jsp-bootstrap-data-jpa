package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyjava.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
