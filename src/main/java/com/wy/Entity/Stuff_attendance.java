package com.wy.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stuff_attendance")
public class Stuff_attendance {
    @Id
    private String emid;
    private String departName;
    private String emname;
    private int late;
    private int earlyleave;
    private int extrawork;
    private int holiday;
    private int absent;

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
}
