package com.diet.system.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diet.system.entity.User;
import com.diet.system.service.UserService;


@RestController
@RequestMapping("/api")
public class UserRestController {
	@Autowired
	public UserService userService;
	
	
	@PostMapping("/users")
	public User addUser(@RequestBody User theUser )
	{
		
		theUser.setId(0);
		userService.addUser(theUser);
		
	return theUser;
	}
	
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User theUser )
	{
		userService.addUser(theUser);
		return theUser;

	}   
	
	@DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable int userId)
	{
		
		User tempUser=userService.getByUserId(userId);
		
		if(tempUser==null){
			throw new UserNotFoundException("User id not found "+userId);
		}
		userService.deleteUser(tempUser);
		
		return "User deleted";
	}
	
	@GetMapping("/users/{userId}")
	public User getByUserId(@PathVariable int userId)
	{
		
		User tempUser=userService.getByUserId(userId);
		
     if(tempUser==null){
			throw new UserNotFoundException("User id not found "+userId);
		}
		
		return tempUser;
	}
	
	@GetMapping("/users")
	public List<User> getByUserId() throws Exception
	{
		List<User> tempAllUser=userService.getAllUser();
		
		if(tempAllUser.isEmpty()){

				throw new Exception("No User");
	
		}
		return tempAllUser;
	}
	
}
