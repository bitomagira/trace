package trace.msd.users;

import java.util.List;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trace.msd.mappers.Implementations.UserToUserDtoImpl;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserToUserDtoImpl userToUserDto;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public User postUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	public User getUserByLogin(String login, String pwd) {
		return userRepository.getUserByLogin(login,pwd);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public UserDto getUserByMail(String mail){
		User response = userRepository.findByPseudo(mail);
		UserDto userDto = userToUserDto.userToUserDto(response);
		System.out.println("----------- resp  "+userDto.getNom());
		return userDto;

	}
}
