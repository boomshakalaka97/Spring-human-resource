package com.wy.Service;

import com.wy.Dao.DepartDao;
import com.wy.Entity.Depart;
import com.wy.Util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartService {
    @Autowired
    DepartDao departDao;

    public void addDepart(Depart depart){
        try{
            Depart depart1=new Depart();
            depart1.setDepartId(IdUtil.generateId());
            depart1.setDepartName(depart.getDepartName());
            departDao.save(depart1);
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
    public List<Depart> findAllDepart(){
        return departDao.findAll();
    }

    public List<Depart> findDepartVague(String departName){
        return departDao.findAllByDepartNameContaining(departName);
    }
}
