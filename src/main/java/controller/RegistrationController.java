package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import repository.UserRepository;

@RequestMapping("ekart")
@RestController
public class RegistrationController {

	@Autowired
	UserRepository userRepo;
	
	@PostMapping("register")
	@ResponseBody
	public void registration(User user) {
		userRepo.save(user);
	}
	
}
