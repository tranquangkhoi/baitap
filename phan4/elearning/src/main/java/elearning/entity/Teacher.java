package elearning.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
@Data
@Entity
@Table(name = "teachers")
public class Teacher extends User implements Serializable {
    private String phone;

    private Integer experiences;
}
