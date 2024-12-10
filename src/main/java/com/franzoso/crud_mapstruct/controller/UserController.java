package com.franzoso.crud_mapstruct.controller;

import com.franzoso.crud_mapstruct.business.dto.UserRecord;
import com.franzoso.crud_mapstruct.business.dto.UserRequestDTO;
import com.franzoso.crud_mapstruct.business.dto.UserResponseDTO;
import com.franzoso.crud_mapstruct.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> insertUser(@RequestBody UserRequestDTO requestDTO) {
        var userEmail = userService.insertUser(requestDTO);
        return ResponseEntity.created(URI.create("/users" + userEmail.toString())).build();
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserRecord> findByEmail(@PathVariable("email") String email) {
        return ResponseEntity.ok(userService.findByEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @PutMapping("/{email}")
    public ResponseEntity<UserResponseDTO> updateByEmail(@RequestBody UserRequestDTO requestDTO, @PathVariable("email") String email) {
        return ResponseEntity.ok(userService.updateByEmail(requestDTO, email));
    }

    @PutMapping
    public ResponseEntity<UserResponseDTO> updateById(@RequestBody UserRequestDTO requestDTO, @RequestParam Long id) {
        return ResponseEntity.ok(userService.updateById(requestDTO, id));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> deleteByEmail(@PathVariable("email") String email) {
        userService.deleteByEmail(email);
        return ResponseEntity.noContent().build();
    }
}
