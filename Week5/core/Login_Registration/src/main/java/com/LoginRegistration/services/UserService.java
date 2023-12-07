package com.LoginRegistration.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.LoginRegistration.models.LoginUser;
import com.LoginRegistration.models.User;
import com.LoginRegistration.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	// This method will be called from the controller
	// whenever a user submits a registration form.

	public User register(User newUser, BindingResult result) {

		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());

		if (potentialUser.isPresent()) {
			result.rejectValue("email", "registerError", "An account with that email already exists!");
		}

		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "registerError", "The Confirm Password must match Password!");
		}

		if (result.hasErrors()) {
			return null;
		}else {
			String hashedPw = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashedPw);
			//Save to Db
			return userRepo.save(newUser);	
		}
	}

	// This method will be called from the controller
	// whenever a user submits a login form.
	public User login(LoginUser newLoginUser, BindingResult result) {
		// TO-DO - Reject values:

		Optional<User> potentialUser = userRepo.findByEmail(newLoginUser.getEmail());

		if (!potentialUser.isPresent()) {
			result.rejectValue("email", "loginError", "email  not found!");			
		}else {
			User user = potentialUser.get();
			if (!BCrypt.checkpw(newLoginUser.getPassword(), user.getPassword())) {
				result.rejectValue("password", "loginError", "Invalid Password!");
			}
			if (result.hasErrors()) {
				return null;
			}else {
				return user;			
			}
		}
		return null;	
	}

	public User findById(Long id) {
		Optional<User> potentialUser = userRepo.findById(id);
		if (potentialUser.isPresent()) {
			return potentialUser.get();
		}
		return null;
	}
}
