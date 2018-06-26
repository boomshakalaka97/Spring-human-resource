package com.wy.Controller;

import com.wy.Service.Stuff_salaryService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping(value="/stuffsalary")
public class Stuff_salaryController {
    @Autowired
    Stuff_salaryService stuff_salaryService;

    @PostMapping(value="/salarycalculate")
    @ResponseBody
    public ReturnUtil salarycalculate(){
        stuff_salaryService.filltable(stuff_salaryService.salarycalculate());
        return ReturnUtil.ok(stuff_salaryService.salarycalculate());
    }

    @PostMapping(value="/findAllSalary")
    @ResponseBody
    public ReturnUtil findAllSalary(){
        return ReturnUtil.ok(stuff_salaryService.findAllSalary());
    }
}
