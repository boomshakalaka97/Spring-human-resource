package com.wy.Dao;

import com.wy.Entity.Wage_rules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Wage_rulesDao extends JpaRepository<Wage_rules,String> {
    Wage_rules save(Wage_rules wage_rules);
    void delete(Wage_rules wage_rules);
    Wage_rules findByAttendance(String attendance);
}
