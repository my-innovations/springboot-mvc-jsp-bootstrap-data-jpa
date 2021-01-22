package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyjava.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
