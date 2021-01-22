package com.mightyjava.service.impl;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.Role;
import com.mightyjava.entity.User;
import com.mightyjava.repository.RoleRepository;
import com.mightyjava.repository.UserRepository;
import com.mightyjava.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public String addUser(User user) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (user.getId() == null) {
				message = "Added";
			} else {
				message = "Updated";
			}
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			user.setRole(roleRepository.findOne(user.getRoleId()));
			jsonObject.put("status", "success");
			jsonObject.put("title", message + " Confirmation");
			jsonObject.put("message", userRepository.save(user).getFullName() + " " + message + " successfully.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> userList() {
		return userRepository.findAll();
	}

	@Override
	public List<Role> roleList() {
		return roleRepository.findAll();
	}

	@Override
	public String deleteUser(Long id) {
		JSONObject jsonObject = new JSONObject();
		try {
			userRepository.delete(id);
			jsonObject.put("message", "User Deleted Successfully.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
}
