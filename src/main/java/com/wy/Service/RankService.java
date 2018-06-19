package com.wy.Service;

import com.wy.Dao.RankDao;
import com.wy.Entity.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {
    @Autowired
    RankDao rankDao;

    public void addRank(Rank rank){
        try{
            rankDao.save(rank);
        }catch (Exception e){

        }
    }

    public void deleteRank(Rank rank){
        try{
            rankDao.delete(rank);
        }catch (Exception e){

        }
    }

    public void updateRank(Rank rank){
        try{
            rankDao.save(rank);
        }catch (Exception e){

        }
    }

    public Rank findRank(Rank rank){
        try{
            return rankDao.findByRankId(rank.getRankId());
        }catch(Exception e){
            return null;
        }
    }
}
