/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.factory;

import elearning.entity.Student;
import elearning.entity.Teacher;
import elearning.entity.User;
import elearning.dto.UserReqDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component
@RequiredArgsConstructor
public class UserFactory {

    private final ModelMapper modelMapper;

    public User createUser(UserReqDto userReqDto) {
        switch (userReqDto.getMode()) {
            case "STUDENT":
                Student student = modelMapper.map(userReqDto, Student.class);
                modelMapper.map(userReqDto.getStudent(), student);
                return student;
            case "TEACHER":
                Teacher teacher = modelMapper.map(userReqDto, Teacher.class);
                modelMapper.map(userReqDto.getTeacher(), teacher);
                return teacher;
            default:
                throw new UnsupportedOperationException("Unsupported register mode");
        }
    }

}