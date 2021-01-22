package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.Role;
import com.mightyjava.entity.User;

public interface UserService {
	
	List<User> userList();
	User findOne(Long id);
	String addUser(User user);
	String deleteUser(Long id);
	List<Role> roleList();
}
