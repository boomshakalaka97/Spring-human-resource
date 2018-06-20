package com.wy.Dao;

import com.wy.Entity.Depart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartDao extends JpaRepository<Depart,String> {
    Depart save(Depart depart);
    void delete(Depart depart);
    Depart findByDepartId(String departId);
    List<Depart> findAll();
}
