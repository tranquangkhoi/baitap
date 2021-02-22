package elearning.service;

import elearning.repository.CourseRepository;
import elearning.dto.CourseResDto;
import elearning.factory.SortCourseStrategyFactory;
import elearning.strategy.sort.course.ISortCourseStrategy;
import elearning.entity.Course;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Admin
 */
@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
    private final SortCourseStrategyFactory sortCourseStrategyFactory;
    
    @Transactional
    public List<CourseResDto> search(String keyword, String sortBy) {
        List<Course> courses = query(keyword);
        ISortCourseStrategy sortCourseStrategy = sortCourseStrategyFactory.createSortCourseStrategyFactory(sortBy);
        sortCourseStrategy.sort(courses);
        
        List<CourseResDto> results = new ArrayList<>();
        courses.forEach(course -> {
            CourseResDto courseResDto = new CourseResDto();
            courseResDto.setId(course.getId());
            courseResDto.setLocation(course.getLocation());
            courseResDto.setName(course.getName());
            courseResDto.setTeacherName(course.getTeacher().getName());
            results.add(courseResDto);
        });
        
        return results;
    }
    
    private List<Course> query(String keyword) {
        List<Course> courses;
        if(StringUtils.isEmpty(keyword)) {
            courses = courseRepository.findAll();
        } else {
            courses = courseRepository.findByName(keyword);
        }
        return courses;
    }
    
}
