/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.dto;

import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
public class CourseResDto {
    private Integer id;
    private String name;
    private String location;
    private String teacherName;
}
