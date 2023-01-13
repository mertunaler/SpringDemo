package com.Mert.userManagement.restAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mert.userManagement.Business.IUserManager;
import com.Mert.userManagement.Entities.User;
@RestController
public class UserController {
	
	private IUserManager userManager;
	
	@Autowired
	public UserController(IUserManager userManager) {
		this.userManager = userManager;
	}
	
	@GetMapping("/users")
	public List<User> get() {
		return userManager.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User user) {
		userManager.add(user);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody User user) {
		
		userManager.delete(user);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody User user)
	{
		userManager.update(user);
	}

}
