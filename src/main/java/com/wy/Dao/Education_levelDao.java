package com.wy.Dao;

import com.wy.Entity.Education_level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Education_levelDao extends JpaRepository<Education_level,String> {
    Education_level save(Education_level education_level);
    void delete(Education_level education_level);
    Education_level findByLevelId(String education_levelId);
}
