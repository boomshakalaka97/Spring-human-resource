package com.wy.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stuff_salary")
public class Stuff_salary {
    @Id
    private String emid;
    private String departName;
    private String emname;
    private int late;
    private int earlyleave;
    private int extrawork;
    private int holiday;
    private int absent;
    private int late_salary;
    private int earlyleave_salary;
    private int extrawork_salary;
    private int holiday_salary;
    private int absent_salary;
    private int basesalary;
    private int totalsalary;

    public int getTotalsalary() {
        return totalsalary;
    }

    public void setTotalsalary(int totalsalary) {
        this.totalsalary = totalsalary;
    }

    public String getEmid() {
        return emid;
    }

    public void setEmid(String emid) {
        this.emid = emid;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getEmname() {
        return emname;
    }

    public void setEmname(String emname) {
        this.emname = emname;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public int getEarlyleave() {
        return earlyleave;
    }

    public void setEarlyleave(int earlyleave) {
        this.earlyleave = earlyleave;
    }

    public int getExtrawork() {
        return extrawork;
    }

    public void setExtrawork(int extrawork) {
        this.extrawork = extrawork;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int getLate_salary() {
        return late_salary;
    }

    public void setLate_salary(int late_salary) {
        this.late_salary = late_salary;
    }

    public int getEarlyleave_salary() {
        return earlyleave_salary;
    }

    public void setEarlyleave_salary(int earlyleave_salary) {
        this.earlyleave_salary = earlyleave_salary;
    }

    public int getExtrawork_salary() {
        return extrawork_salary;
    }

    public void setExtrawork_salary(int extrawork_salary) {
        this.extrawork_salary = extrawork_salary;
    }

    public int getHoliday_salary() {
        return holiday_salary;
    }

    public void setHoliday_salary(int holiday_salary) {
        this.holiday_salary = holiday_salary;
    }

    public int getAbsent_salary() {
        return absent_salary;
    }

    public void setAbsent_salary(int absent_salary) {
        this.absent_salary = absent_salary;
    }

    public int getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(int basesalary) {
        this.basesalary = basesalary;
    }
}
