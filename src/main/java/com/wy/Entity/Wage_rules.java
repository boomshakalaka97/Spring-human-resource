package com.wy.Entity;



import javax.persistence.*;


@Entity
@Table(name="wage_rules")
public class Wage_rules {
    @Id
    private String attendance;

    private int wageInfluence;

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public int getWageInfluence() {
        return wageInfluence;
    }

    public void setWageInfluence(int wageInfluence) {
        this.wageInfluence = wageInfluence;
    }
}
