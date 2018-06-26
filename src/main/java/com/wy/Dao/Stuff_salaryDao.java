package com.wy.Dao;



import com.wy.Entity.Stuff_salary;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stuff_salaryDao extends JpaRepository<Stuff_salary,String> {

    Stuff_salary save(Stuff_salary stuff_salary);

    List<Stuff_salary> findAll();
}
