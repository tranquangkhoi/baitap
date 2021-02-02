/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning.dto;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
public class TeacherDto {
    @NotBlank
    @ApiModelProperty(value = "Phone", example = "0977688077")
    private String phone;
    
    @NotBlank
    @ApiModelProperty(value = "Experience", example = "5")
    private Integer experiences;
}