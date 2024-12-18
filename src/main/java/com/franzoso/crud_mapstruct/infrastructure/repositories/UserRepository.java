package com.franzoso.crud_mapstruct.infrastructure.repositories;

import com.franzoso.crud_mapstruct.infrastructure.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository  extends JpaRepository<User, Long> {

    User findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
