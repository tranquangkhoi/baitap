/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.controller;

import elearning.service.UserService;
import elearning.dto.UserReqDto;
import elearning.dto.UserResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @ApiOperation("Create user")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Create user successfully")
    })
    public ResponseEntity<UserResDto> createUser(@RequestBody UserReqDto userReqDto) {
        UserResDto response = userService.saveUser(userReqDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
