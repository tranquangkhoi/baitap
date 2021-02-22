/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.strategy.sort.course;

import elearning.entity.Course;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Admin
 */
public class SortCourseOpenedDesc implements ISortCourseStrategy {

    @Override
    public void sort(List<Course> courses) {
        Collections.sort(courses, (Course val1, Course val2) -> val1.getOpened().compareTo(val2.getOpened()) > 0  ? -1 : 1);
    }

    
}
