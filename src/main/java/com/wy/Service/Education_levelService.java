package com.wy.Service;

import com.wy.Dao.Education_levelDao;
import com.wy.Entity.Education_level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education_levelService {
    @Autowired
    Education_levelDao education_levelDao;

    public void addEducation_level(Education_level education_level){
        try{
            education_levelDao.save(education_level);
        }catch (Exception e){

        }
    }

    public void deleteEducation_level(Education_level education_level){
        try{
            education_levelDao.delete(education_level);
        }catch (Exception e){

        }
    }

    public void updateEducation_level(Education_level education_level){
        try{
            education_levelDao.save(education_level);
        }catch (Exception e){

        }
    }

    public Education_level findEducation_level(Education_level education_level){
        try{
            return education_levelDao.findByLevelId(education_level.getLevelId());
        }catch(Exception e){
            return null;
        }
    }

    public List<Education_level> findAllLevel(){
        return education_levelDao.findAll();
    }

}
