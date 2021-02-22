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
import elearning.error.ErrorCodes;
import elearning.error.ServiceRuntimeException;
import elearning.factory.UserFactory;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;

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
        if(userRepository.isExistByEmail(userReqDto.getEmail())) {
            throw new ServiceRuntimeException(
                    HttpStatus.BAD_REQUEST,
                    ErrorCodes.USER_E001,
                    String.format("Email was registered : %s", userReqDto.getEmail()));
        }
        User userRequest = userFactory.createUser(userReqDto);
        User savedUser = userRepository.save(userRequest);
        return modelMapper.map(savedUser, UserResDto.class);
    }
}
