package ma.emsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.entities.Role;

public interface RoleRep extends JpaRepository<Role, Integer> {
	public Role findById(int id);

}
