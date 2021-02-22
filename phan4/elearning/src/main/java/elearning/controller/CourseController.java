/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.controller;

import elearning.service.CourseService;
import elearning.dto.CourseResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CourseController {
    
    private final CourseService courseService;
    
    @GetMapping("/courses")
    @Cacheable("get-courses")
    public ResponseEntity<List<CourseResDto>> getCourses(@RequestParam(required = false) String keyword, @RequestParam(required = false) String sortBy) {
        List<CourseResDto> response  = courseService.search(keyword, sortBy);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
