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
public class UserResDto {
    @ApiModelProperty(value = "User ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;
}
