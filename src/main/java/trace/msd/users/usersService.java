package trace.msd.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usersService {
	
	@Autowired
	private userRepo Myrepo;
	
	public List<usersModel> getAll(){
		return Myrepo.findAll();
	}
	
	public usersModel postUser(usersModel user) {
		Myrepo.save(user);
		return user;
	}
	
	public usersModel getUserByLogin(String login,String pwd) {
		return Myrepo.getUserByLogin(login,pwd);
		
	}

}
