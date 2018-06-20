package com.wy.Dao;

import com.wy.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,String> {
    Employee save(Employee employee);
    List<Employee> findByNatureWork(String Nature_work);
    List<Employee> findAll();
    List<Employee> findBySituation(String Situation);
}
