package Finance_Dashboard_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Finance_Dashboard_Backend.entity.User;
import Finance_Dashboard_Backend.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository repo;

    public User save(User user) {
        return repo.save(user);
    }

    public List<User> getAll() {
        return repo.findAll();
    }
}
