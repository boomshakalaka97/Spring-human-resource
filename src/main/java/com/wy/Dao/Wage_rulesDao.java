package com.wy.Dao;

import com.wy.Entity.Wage_rules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Wage_rulesDao extends JpaRepository<Wage_rules,Integer> {
    Wage_rules findByRulesid(String rulesid);
    Wage_rules save(Wage_rules wage_rules);
}
