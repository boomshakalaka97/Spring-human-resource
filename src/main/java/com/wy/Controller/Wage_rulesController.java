package com.wy.Controller;

import com.wy.Entity.Wage_rules;
import com.wy.Service.Wage_rulesService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value="/wage_rules")
public class Wage_rulesController {
    @Autowired
    private Wage_rulesService wage_rulesService;

    @PostMapping(value="/add")
    @ResponseBody
    public void addRules(@RequestBody Wage_rules rules){
        wage_rulesService.addRules(rules);
    }

    @PostMapping(value="/delete")
    @ResponseBody
    public void deleteRules(@RequestBody Wage_rules rules){
        wage_rulesService.deleteRules(rules);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public ReturnUtil updateRules(@RequestBody Wage_rules rules){

        wage_rulesService.updateRules(rules);
        return ReturnUtil.ok();
    }

    @PostMapping(value="/find")
    @ResponseBody
    public Wage_rules findRules(@RequestBody Wage_rules rules){
        return wage_rulesService.findRules(rules);
    }
}
