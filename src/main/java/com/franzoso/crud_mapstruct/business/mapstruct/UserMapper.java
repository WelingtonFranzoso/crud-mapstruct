package com.franzoso.crud_mapstruct.business.mapstruct;

import com.franzoso.crud_mapstruct.business.dto.UserRecord;
import com.franzoso.crud_mapstruct.business.dto.UserRequestDTO;
import com.franzoso.crud_mapstruct.business.dto.UserResponseDTO;
import com.franzoso.crud_mapstruct.infrastructure.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toUser(UserRequestDTO userRequestDTO);

    UserResponseDTO toResponseDTO(User user);

    UserRecord toUserRecord(User user);

    List<UserResponseDTO> toResponseDTOList(List<User> userList);



}
