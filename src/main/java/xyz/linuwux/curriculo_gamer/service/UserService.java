package xyz.linuwux.curriculo_gamer.service;

import xyz.linuwux.curriculo_gamer.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
