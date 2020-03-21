package com.abir.zerotechsoft.user;

import java.util.List;
import java.util.Optional;

public interface UserService {
	
	public List<User> allUser();
	public Optional<User> findById(Long id);
	public User findByEmail(String email);
	public void addUser(User user);
	public void deleteUser(User user);
	public void deleteAllUser();

}
