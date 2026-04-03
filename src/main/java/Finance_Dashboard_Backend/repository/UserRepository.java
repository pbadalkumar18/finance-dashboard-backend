package Finance_Dashboard_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Finance_Dashboard_Backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
