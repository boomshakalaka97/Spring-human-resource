package com.wy.Controller;

import com.wy.Entity.Rank;
import com.wy.Service.RankService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value="/rank")
public class RankController {
    @Autowired
    RankService rankService;

    @PostMapping(value="/add")
    @ResponseBody
    public void addRank(@RequestBody Rank rank){
        rankService.addRank(rank);
    }

    @PostMapping(value="/delete")
    @ResponseBody
    public void deleteRank(@RequestBody Rank rank){
        rankService.deleteRank(rank);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public void updateRank(@RequestBody Rank rank){
        rankService.updateRank(rank);
    }

    @PostMapping(value="/find")
    @ResponseBody
    public Rank findRank(@RequestBody Rank rank){
        return rankService.findRank(rank);
    }

    @PostMapping(value="/findAllRank")
    @ResponseBody
    public ReturnUtil getAllRank(){
        return ReturnUtil.ok(rankService.getAllRank());
    }
}
