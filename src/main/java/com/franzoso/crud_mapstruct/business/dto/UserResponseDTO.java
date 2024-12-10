package com.franzoso.crud_mapstruct.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UserResponseDTO {

    @JsonProperty(required = true)
    private Long id;
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String email;

    public UserResponseDTO() {
    }

    public UserResponseDTO(String name, String email, Long id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
