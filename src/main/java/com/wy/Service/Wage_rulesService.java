package com.wy.Service;


import com.wy.Dao.Wage_rulesDao;
import com.wy.Entity.Wage_rules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Wage_rulesService {
    @Autowired
    private Wage_rulesDao wage_rulesDao;

    public void addRules(Wage_rules rules){
        try{
            wage_rulesDao.save(rules);
        }catch (Exception e){

        }
    }

    public void deleteRules(Wage_rules rules){
        try{
            wage_rulesDao.delete(rules);
        }catch (Exception e){

        }
    }

    public void updateRules(Wage_rules rules){
        try{
            wage_rulesDao.save(rules);
        }catch (Exception e){

        }
    }

    public Wage_rules findRules(Wage_rules rules){
        try{
            return wage_rulesDao.findByRulesid(rules.getRulesid());
        }catch(Exception e){
            return null;
        }
    }
}
