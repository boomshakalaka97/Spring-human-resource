package com.wy.Controller;

import com.wy.Service.Stuff_attendanceService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

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

    @PostMapping(value="/findexcel")
    @ResponseBody
    public ReturnUtil findexcel(@RequestBody MultipartFile file){
        File temp = null;
        try {
            temp = File.createTempFile(String.valueOf(new Date().getTime()), "temp");
            file.transferTo(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReturnUtil res = stuff_attendanceService.findexcel(temp);
        temp.delete();
        return res;
    }
}
