package com.Mert.userManagement.DAO;

import java.util.List;

import com.Mert.userManagement.Entities.User;

public interface IUserDAO {

	void add(User user);
	void delete(User user);
	void update(User user);
	List <User> getAll();
}
