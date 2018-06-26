package com.wy.Service;

import com.wy.Dao.Stuff_attendanceDao;
import com.wy.Entity.Stuff_attendance;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

import static com.wy.Util.ExcelUtil.readExcel;

@Service
public class Stuff_attendanceService {
    @Autowired
    Stuff_attendanceDao stuff_attendanceDao;

    public List<Stuff_attendance> findAll(){
        return stuff_attendanceDao.findAll();
    }

    public ReturnUtil findexcel(File file) {
        try {
            List<List> list = readExcel(file);
            int listnum=0;
            for (List li : list) {
                if(listnum!=0){
                    Stuff_attendance stuff = new Stuff_attendance();
                    stuff.setEmid( Integer.parseInt((String)li.get(0)));
                    stuff.setLate( Integer.parseInt((String)li.get(1)));
                    stuff.setEarlyleave(Integer.parseInt((String)li.get(2)));
                    stuff.setExtrawork(Integer.parseInt((String)li.get(3)));
                    stuff.setHoliday(Integer.parseInt((String)li.get(4)));
                    stuff.setAbsent(Integer.parseInt((String)li.get(5)));
                    stuff_attendanceDao.save(stuff);
                }
                listnum++;
            }

        } catch (Exception e) {

        }
        return ReturnUtil.ok();
    }
}
