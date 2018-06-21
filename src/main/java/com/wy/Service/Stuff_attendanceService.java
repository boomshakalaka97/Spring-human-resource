package com.wy.Service;

import com.wy.Dao.Stuff_attendanceDao;
import com.wy.Entity.Stuff_attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Stuff_attendanceService {
    @Autowired
    Stuff_attendanceDao stuff_attendanceDao;

    public List<Stuff_attendance> findAll(){
        return stuff_attendanceDao.findAll();
    }
}
