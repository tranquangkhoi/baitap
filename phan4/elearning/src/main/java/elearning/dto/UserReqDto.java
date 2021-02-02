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
public class UserReqDto {
    @ApiModelProperty(value = "User ID", example = "1")
    private Integer user_id;
    
    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String full_name;
    
    @NotBlank
    @ApiModelProperty(value = "Email", example = "XYZ@gmail.com")
    private String email;

    @NotBlank
    @ApiModelProperty(value = "User password", example = "123456")
    private String password;
    
    @ApiModelProperty()
    private TeacherDto teacher;
    
    @NotBlank
    @ApiModelProperty(value = "Mode", example = "TEACHER")
    private String mode;
}