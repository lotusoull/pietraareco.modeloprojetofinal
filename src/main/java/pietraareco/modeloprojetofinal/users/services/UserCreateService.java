package pietraareco.modeloprojetofinal.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pietraareco.modeloprojetofinal.users.dto.UserCreateDTO;
import pietraareco.modeloprojetofinal.users.dto.UserResponseDTO;
import pietraareco.modeloprojetofinal.users.entities.User;
import pietraareco.modeloprojetofinal.users.repositories.UserRepository;
import pietraareco.modeloprojetofinal.users.services.UserMapper.UserMapper;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public UserResponseDTO createUser(UserCreateDTO dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toResponseDTO(userRepository.save(user));
    }
}
