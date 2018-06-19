package com.wy.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    private String emid;
    private String emname;
    private String sex;
    private String nation;
    private String marriage;
    private String levelId;
    private String health;
    private String birthplace;
    private String IDnum;
    private String school;
    private String address;
    private String postId;
    private String situation;
    private String departId;
    private String rankId;
    private Date birth;
    private Date datecome ;


}
