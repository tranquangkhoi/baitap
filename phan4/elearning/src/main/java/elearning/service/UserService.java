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
import elearning.entity.User;
import elearning.factory.UserFactory;
import org.modelmapper.ModelMapper;

/**
 *
 * @author Admin
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserFactory userFactory;
    private final ModelMapper modelMapper;
    
    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        User userRequest = userFactory.createUser(userReqDto);
        User savedUser = userRepository.save(userRequest);
        UserResDto response = modelMapper.map(savedUser, UserResDto.class);
        return response;
    }
}
