package elearning.entity;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
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
@Table(name = "students")
public class Student extends User implements Serializable {
    private String year;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Enroll> enrolls;
}
