package com.charbio.service;

import com.charbio.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
