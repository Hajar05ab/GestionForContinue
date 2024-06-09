package ma.emsi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import ma.emsi.entities.User;
import ma.emsi.services.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/save")
	@PreAuthorize("hasAuthority('SCOPE_ADMIN')")
	public User save(@RequestBody User object) {
		System.out.println("Saving User: " + object); // Log the received object
		return userService.save(object);
	}
	
	@PutMapping(value = "/update/{id}")
	@PreAuthorize("hasAuthority('SCOPE_ADMIN')")
	public User update(@PathVariable int id, @RequestBody User object) {
		System.out.println("Updating User ID " + id + ": " + object); // Log the received object and ID
		return userService.update(id, object);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	@PreAuthorize("hasAuthority('SCOPE_ADMIN')")
	public void delete(@PathVariable int id) {
		System.out.println("Deleting User ID " + id); // Log the ID of the object to be deleted
		userService.delete(id);
	}
	
	@GetMapping(value = "/{id}")
	@PreAuthorize("hasAuthority('SCOPE_ADMIN')")
	public User findById(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@GetMapping(value = "")
	@PreAuthorize("hasAuthority('SCOPE_ADMIN')")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	


	
	

}
