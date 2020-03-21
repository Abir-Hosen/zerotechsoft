package com.abir.zerotechsoft.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> allUser(){
		return userService.allUser();
	}
	
	@PostMapping
	public void addUser(@RequestBody @Valid User user, BindingResult bindingResult) {
		userService.addUser(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody @Valid User user, BindingResult bindingResult) {
		userService.addUser(user);
	}

	@DeleteMapping
	public void deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
	}
}