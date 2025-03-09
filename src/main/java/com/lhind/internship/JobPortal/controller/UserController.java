package com.lhind.internship.JobPortal.controller;

import com.lhind.internship.JobPortal.model.entity.User;
import com.lhind.internship.JobPortal.model.enums.UserRole;
import com.lhind.internship.JobPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getAllUsersByRole")
    public ResponseEntity<Page<User>> getAllUsers(
            @RequestParam(required = false) UserRole role,
            Pageable pageable) {
        return ResponseEntity.ok(userService.getAllUsers(role, pageable));
    }


    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
}
