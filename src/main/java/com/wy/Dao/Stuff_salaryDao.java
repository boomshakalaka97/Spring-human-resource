package com.wy.Dao;



import com.wy.Entity.Stuff_salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Stuff_salaryDao extends JpaRepository<Stuff_salary,String> {

    Stuff_salary save(Stuff_salary stuff_salary);
}
