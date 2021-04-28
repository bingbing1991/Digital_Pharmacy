package com.project.DigitalPharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.DigitalPharmacy.model.User;
import com.project.DigitalPharmacy.service.RegistrationService;

@RestController
public class RegistrationController
{
	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/registerUser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId))
		{
			//check if this emailId already exist in the DB
			User foundUser = registrationService.findUserByEmailId(tempEmailId);
			if(foundUser != null)
			{
				throw new Exception("User with this " +tempEmailId+ " already exists.");
			}
		}
		User registeredUser = new User();
		registeredUser = registrationService.saveUser(user);
		return registeredUser;
	}
	
	@PostMapping("/LoginUser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmailId();
		String tempPassword = user.getPassword();
		User foundUser = null;
		
		if(tempEmailId != null && tempPassword != null)
		{
			foundUser = registrationService.findUserByEmailIdAndPassword(tempEmailId, tempPassword);
			if(foundUser == null)
			{
				throw new Exception("Invalid Username or Password");
			}
		}
		return foundUser;
	}
}
