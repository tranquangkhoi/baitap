/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.strategy.sort.course;

import java.util.List;
import elearning.entity.Course;

/**
 *
 * @author Admin
 */
public interface ISortCourseStrategy {
    void sort(List<Course> items);
}
