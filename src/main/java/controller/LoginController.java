package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import repository.UserRepository;

@RestController
@RequestMapping("ekart")
public class LoginController {
		
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("login")
	public String login(User user) {
		User dbUser =  userRepo.getOne(user.getEmail());
		if(user.getPassword().equals(dbUser.getPassword()))
			return "Sucsess";
		return "Failed";
	}

}
