package com.Mert.userManagement.Business;

import java.util.List;

import com.Mert.userManagement.Entities.User;

public interface IUserManager {
	void add(User user);
	void delete(User user);
	void update(User user);
	List <User> getAll();
}
