/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.service;

import elearning.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import elearning.dto.UserResDto;
import elearning.dto.UserReqDto;
import elearning.entity.IUserRequest;
import elearning.entity.Teacher;
import elearning.entity.UserRequestFactory;

/**
 *
 * @author Admin
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    
    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        //UserRequestFactory userRequestFactory = new UserRequestFactory();
        Teacher userRequest = new Teacher();
        userRequest.setId(userReqDto.getId());
        userRequest.setName(userReqDto.getName());
        userRequest.setEmail(userReqDto.getEmail());
        userRequest.setPassword(userReqDto.getPassword());
        userRequest.setExperiences(userReqDto.getTeacher().getExperiences());
        userRequest.setPhone(userReqDto.getTeacher().getPhone());
        Teacher savedUser = userRepository.save(userRequest);
        return null;
    }
}
