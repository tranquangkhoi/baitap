/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.strategy.sort.course;

import elearning.entity.Course;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SortCourseNameAsc implements ISortCourseStrategy{

    @Override
    public void sort(List<Course> courses) {
        courses.sort(Comparator.comparing(Course::getName));
    }
    
}
