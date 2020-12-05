package trace.msd.mappers.Implementations;


import org.springframework.stereotype.Service;
import trace.msd.mappers.UserToUserDto;
import trace.msd.users.User;
import trace.msd.users.UserDto;

@Service
public class UserToUserDtoImpl implements UserToUserDto {

     @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setNom( user.getNom() );
        userDto.setPrenom( user.getPrenom() );
        userDto.setId( user.getId() );

        return userDto;
    }
}
