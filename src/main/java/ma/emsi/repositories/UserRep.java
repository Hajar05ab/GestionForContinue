package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.User;

public interface UserRep extends JpaRepository<User, Integer>{
	public User findById(int id);

}
