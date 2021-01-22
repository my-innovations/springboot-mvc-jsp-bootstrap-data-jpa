package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.Address;

public interface AddressService {
	List<Address> addressList();
	
	Address findOne(Long id);
	
	String addAddress(Address address);
	
	String deleteAddress(Long id);
}
