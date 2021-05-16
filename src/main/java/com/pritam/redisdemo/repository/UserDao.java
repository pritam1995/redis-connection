package com.pritam.redisdemo.repository;

import java.util.List;

import com.pritam.redisdemo.model.User;

public interface UserDao {
	
	boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);

}
