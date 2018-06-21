package com.wy.Controller;

import com.wy.Service.Stuff_attendanceService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping(value="/stuff_attendence")
public class Stuff_attendanceController {
    @Autowired
    Stuff_attendanceService stuff_attendanceService;

    @PostMapping(value="/findAll")
    @ResponseBody
    public ReturnUtil findAll(){
        System.out.println(stuff_attendanceService.findAll());
        return ReturnUtil.ok(stuff_attendanceService.findAll());
    }
}
