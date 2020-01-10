package trace.msd.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usersController {
	@Autowired
	private usersService myService;
	
	@RequestMapping("/api/users")
	public List<usersModel> getUsers() {
		return myService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/users")
	public usersModel postUser(@RequestBody usersModel user) {
		System.out.println(user);
		return myService.postUser(user);
		
	}

}
