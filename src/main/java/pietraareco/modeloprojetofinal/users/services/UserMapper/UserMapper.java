package pietraareco.modeloprojetofinal.users.services.UserMapper;

import pietraareco.modeloprojetofinal.users.dto.UserCreateDTO;
import pietraareco.modeloprojetofinal.users.dto.UserResponseDTO;
import pietraareco.modeloprojetofinal.users.entities.User;

public class UserMapper {

    public static User toEntity(UserCreateDTO dto) {
        return new User(
                dto.name(),
                dto.email()
        );
    }

    public static UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
