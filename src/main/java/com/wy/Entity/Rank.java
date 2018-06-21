package com.wy.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ranklist")
public class Rank {
     @Id
     private String rankId;
     private int basesalary;//?不能使用int

    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public int getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(int basesalary) {
        this.basesalary = basesalary;
    }
}
