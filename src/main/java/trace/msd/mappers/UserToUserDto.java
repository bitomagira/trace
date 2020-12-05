package trace.msd.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import trace.msd.users.User;
import trace.msd.users.UserDto;

@Mapper
public interface UserToUserDto {
    @Mappings({
            @Mapping(target="nom",source="nom"),
            @Mapping(target="prenom",source="prenom")
    })
    UserDto userToUserDto(User user);

}
