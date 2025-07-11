package xyz.linuwux.curriculo_gamer.service.impl;

import org.springframework.stereotype.Service;
import xyz.linuwux.curriculo_gamer.domain.model.User;
import xyz.linuwux.curriculo_gamer.domain.repository.UserRepository;
import xyz.linuwux.curriculo_gamer.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("ID de usuario ja existente.");
        }
        return userRepository.save(userToCreate);
    }
}
