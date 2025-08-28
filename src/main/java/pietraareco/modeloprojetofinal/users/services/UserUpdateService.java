package pietraareco.modeloprojetofinal.users.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pietraareco.modeloprojetofinal.users.dto.UserUpdateEmailDTO;
import pietraareco.modeloprojetofinal.users.dto.UserUpdateNameDTO;
import pietraareco.modeloprojetofinal.users.entities.User;
import pietraareco.modeloprojetofinal.users.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserUpdateService {

    private final UserRepository userRepository;

    public void updateEmail(Long id, UserUpdateEmailDTO dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        user.setEmail(dto.email());
        userRepository.save(user);
    }

    public void updateName(Long id, UserUpdateNameDTO dto) {
        User user = userRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("User not found"));
        user.setName(dto.name());
        userRepository.save(user);
    }
}
