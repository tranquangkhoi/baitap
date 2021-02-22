/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.strategy.sort.course;

import elearning.entity.Course;
import java.util.List;
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class SortCourseOpenedDesc implements ISortCourseStrategy {

    @Override
    public void sort(List<Course> courses) {
        courses.sort(Comparator.comparing(Course::getOpened));
    }

    
}
