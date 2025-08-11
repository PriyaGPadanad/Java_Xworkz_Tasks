package com.xworkz.login.repository;

import com.xworkz.login.dto.UserDTO;

public interface UserRepository {

    String save(UserDTO dto);
}
