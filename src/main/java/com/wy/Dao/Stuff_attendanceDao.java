package com.wy.Dao;

import com.wy.Entity.Stuff_attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stuff_attendanceDao extends JpaRepository<Stuff_attendance,String> {
//    List<Stuff_attendance>
    List<Stuff_attendance> findAll();
}
