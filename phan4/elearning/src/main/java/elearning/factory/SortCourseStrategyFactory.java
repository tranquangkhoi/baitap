/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.factory;

import elearning.strategy.sort.course.ISortCourseStrategy;
import elearning.strategy.sort.course.SortCourseNameAsc;
import elearning.strategy.sort.course.SortCourseOpenedDesc;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component
@RequiredArgsConstructor
public class SortCourseStrategyFactory {

    public ISortCourseStrategy createSortCourseStrategyFactory(String sortBy) {
        if(StringUtils.isEmpty(sortBy)) {
            return new SortCourseNameAsc();
        }
        
        switch (sortBy) {
            case "name":
                return new SortCourseNameAsc();
            case "opened":
                return new SortCourseOpenedDesc();
            default:
                return new SortCourseNameAsc();
        }
    }

}