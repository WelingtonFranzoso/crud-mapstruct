package com.franzoso.crud_mapstruct.business.mapstruct;

import com.franzoso.crud_mapstruct.business.dto.UserRequestDTO;
import com.franzoso.crud_mapstruct.infrastructure.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserUpdateMapper {

    void updateUser(UserRequestDTO requestDTO, @MappingTarget User user);
}
