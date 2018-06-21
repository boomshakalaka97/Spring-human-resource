package com.wy.Service;


import com.wy.Dao.*;
import com.wy.Entity.*;
import org.springframework.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Stuff_salaryService {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    Stuff_attendanceDao stuff_attendanceDao;

    @Autowired
    RankDao rankDao;

    @Autowired
    Wage_rulesDao wage_rulesDao;

    @Autowired
    Stuff_salaryDao stuff_salaryDao;

    @Autowired
    DepartDao departDao;

    public List<Stuff_salary> salarycalculate(){
        List<Stuff_salary> stuff_salaries = new ArrayList<Stuff_salary>();
        List<Stuff_attendance> stuff_attendances = stuff_attendanceDao.findAll();
       /*for(int i=0;i<stuff_attendances.size();i++) {
            System.out.println(stuff_attendances.get(i));
        }*/
        //BeanUtils.copyProperties(stuff_attendances,stuff_salaries );
        for(Stuff_attendance stuff_attendance:stuff_attendances){
            Stuff_salary stuff_salary=new Stuff_salary();
            BeanUtils.copyProperties(stuff_attendance,stuff_salary);
            stuff_salaries.add(stuff_salary);
        }
        for (Stuff_salary stuff_salary : stuff_salaries) {
            Employee employee = employeeDao.findByEmid(stuff_salary.getEmid());
            Rank rank = rankDao.findByRankId(employee.getRankId());
            stuff_salary.setBasesalary(rank.getBasesalary());
            stuff_salary.setEmname(employee.getEmname());
            Depart depart=departDao.findByDepartId(employee.getDepartId());
            stuff_salary.setDepartName(depart.getDepartName());
            Wage_rules wage_rules = wage_rulesDao.findByRulesid("1");
            stuff_salary.setLate_salary(stuff_salary.getLate() * wage_rules.getLate());
            stuff_salary.setEarlyleave_salary(stuff_salary.getEarlyleave() * wage_rules.getEarlyleave());
            stuff_salary.setExtrawork_salary(stuff_salary.getExtrawork() * wage_rules.getExtrawork());
            stuff_salary.setAbsent_salary(stuff_salary.getAbsent() * wage_rules.getAbsent());
            stuff_salary.setHoliday_salary(stuff_salary.getHoliday() * wage_rules.getHoliday());
            stuff_salary.setTotalsalary(stuff_salary.getAbsent_salary()+stuff_salary.getEarlyleave_salary()
                                        +stuff_salary.getExtrawork_salary()+stuff_salary.getHoliday_salary()
                                        +stuff_salary.getLate_salary()+stuff_salary.getBasesalary());
        }
        return stuff_salaries;
    }

    public  void filltable(List<Stuff_salary> stuff_salaries){
        for (Stuff_salary stuff_salary : stuff_salaries) {
            stuff_salaryDao.save(stuff_salary);
        }
    }


}
