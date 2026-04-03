package Finance_Dashboard_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Finance_Dashboard_Backend.entity.User;
import Finance_Dashboard_Backend.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	 @Autowired
	    private UserService service;

	    @PostMapping
	    public User create(@RequestBody User user) {
	        return service.save(user);
	    }

	    @GetMapping
	    public List<User> getAll() {
	        return service.getAll();
	    }
}
