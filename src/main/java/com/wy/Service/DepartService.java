package com.wy.Service;

import com.wy.Dao.DepartDao;
import com.wy.Entity.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartService {
    @Autowired
    DepartDao departDao;

    public void addDepart(Depart depart){
        try{
            departDao.save(depart);
        }catch (Exception e){

        }
    }

    public void deleteDepart(Depart depart){
        try{
            departDao.delete(depart);
        }catch (Exception e){

        }
    }

    public void updateDepart(Depart depart){
        try{
            departDao.save(depart);
        }catch (Exception e){

        }
    }

    public Depart findDepart(Depart depart){
        try{
            return departDao.findByDepartId(depart.getDepartId());
        }catch(Exception e){
            return null;
        }
    }
}
