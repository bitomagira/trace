package trace.msd.users;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService myService;
	
	@GetMapping
	@CrossOrigin(origins="http://localhost:3000")
	public List<User> getUsers() {
		return myService.getAll();
	}
	
	@PostMapping
	public User postUser(@RequestBody User user) {
		log.warn("creating user " + user.getNom());
		return myService.postUser(user);		
	}
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/login/{pwd}")
	public User getUserLogin(@PathVariable String login, @PathVariable String pwd) {
		return myService.getUserByLogin(login, pwd);
	}
    @PutMapping("/{id}")
	public User updateUser(User user){
		return myService.updateUser(user);
	}

	@GetMapping("/{id}")
	public UserDto getUser(@RequestParam String mail){
		System.out.println("before ********************");
		log.warn("inside the controller"+mail);
		return myService.getUserByMail(mail);
	}

}
