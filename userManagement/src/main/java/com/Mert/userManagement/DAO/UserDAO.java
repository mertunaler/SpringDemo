package com.Mert.userManagement.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Mert.userManagement.Entities.User;
@Repository
public class UserDAO implements IUserDAO{

	private EntityManager entityManager;
	
	@Autowired
	public UserDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

	@Override
	@Transactional
	public void add(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}

	@Override
	@Transactional
	public void delete(User user) {
		Session session = entityManager.unwrap(Session.class);
		User toBeDeleted = session.get(User.class, user.getId());
		session.delete(toBeDeleted);
		
	}

	@Override
	@Transactional
	public void update(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}

	@Override
	@Transactional
	public List<User> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<User> usersList = session.createQuery("FROM users",User.class).getResultList();
		return usersList;
	}

}
