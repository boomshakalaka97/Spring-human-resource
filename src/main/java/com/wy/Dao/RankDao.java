package com.wy.Dao;

import com.wy.Entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankDao extends JpaRepository<Rank,String> {
    Rank save(Rank rank);
    void delete(Rank rank);
    Rank findByRankId(String rankId);
    List<Rank> findAll();
}
