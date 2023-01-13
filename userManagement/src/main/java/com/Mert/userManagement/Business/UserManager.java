package com.Mert.userManagement.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mert.userManagement.DAO.IUserDAO;
import com.Mert.userManagement.Entities.User;
@Service
public class UserManager implements IUserManager {
	
	private IUserDAO userDAO;

	@Autowired
	public UserManager(IUserDAO userDAO) {

		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void add(User user) {
		userDAO.add(user);
		
	}

	@Override
	@Transactional
	public void delete(User user) {
		userDAO.delete(user);
		
	}

	@Override
	@Transactional
	public void update(User user) {
		userDAO.update(user);
		
	}

	@Override
	@Transactional
	public List<User> getAll() {
		return userDAO.getAll();
	}

}
