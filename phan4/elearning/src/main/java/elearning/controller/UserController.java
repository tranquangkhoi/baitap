/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.controller;

import elearning.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import elearning.entity.User;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import elearning.dto.UserReqDto;
import elearning.dto.UserResDto;
/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    
    @PostMapping("/users")
    public UserResDto createUser(@Valid @RequestBody UserReqDto user) {
        return userService.saveUser(user);
    }
}
