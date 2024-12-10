package com.franzoso.crud_mapstruct.business.service;

import com.franzoso.crud_mapstruct.business.dto.UserRecord;
import com.franzoso.crud_mapstruct.business.dto.UserRequestDTO;
import com.franzoso.crud_mapstruct.business.dto.UserResponseDTO;
import com.franzoso.crud_mapstruct.business.mapstruct.UserMapper;
import com.franzoso.crud_mapstruct.business.mapstruct.UserUpdateMapper;
import com.franzoso.crud_mapstruct.infrastructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserUpdateMapper userUpdateMapper;

    public UserResponseDTO insertUser(UserRequestDTO userRequestDTO) {
        return userMapper.toResponseDTO(userRepository.save(userMapper.toUser(userRequestDTO)));
    }

    public List<UserResponseDTO> findAll() {
        return userMapper.toResponseDTOList(userRepository.findAll());
    }

    public UserRecord findByEmail(String email) {
        return userMapper.toUserRecord((userRepository.findByEmail(email)));
    }

    public UserResponseDTO updateByEmail(UserRequestDTO requestDTO, String email) {
            var user = userRepository.findByEmail(email);
            userUpdateMapper.updateUser(requestDTO, user);
            return userMapper.toResponseDTO(userRepository.save(user));
    }

    public UserResponseDTO updateById(UserRequestDTO requestDTO, Long id) {
        var user = userRepository.findById(id).orElseThrow();
        userUpdateMapper.updateUser(requestDTO, user);
        return userMapper.toResponseDTO(userRepository.save(user));
    }

    public void deleteByEmail(String email) {
            userRepository.deleteByEmail(email);
        }
}
