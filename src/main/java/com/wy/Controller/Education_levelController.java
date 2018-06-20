package com.wy.Controller;

import com.wy.Entity.Education_level;
import com.wy.Service.Education_levelService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value="/education_level")
public class Education_levelController {
    @Autowired
    Education_levelService education_levelService;
    @PostMapping(value="/add")
    @ResponseBody
    public void addEducation_level(@RequestBody Education_level education_level){
        education_levelService.addEducation_level(education_level);
    }

    @PostMapping(value="/delete")
    @ResponseBody
    public void deleteEducation_level(@RequestBody Education_level education_level){
        education_levelService.deleteEducation_level(education_level);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public void updateEducation_level(@RequestBody Education_level education_level){
        education_levelService.updateEducation_level(education_level);
    }

    @PostMapping(value="/find")
    @ResponseBody
    public Education_level findEducation_level(@RequestBody Education_level education_level){
        return education_levelService.findEducation_level(education_level);
    }

    @PostMapping(value="/findAllLevel")
    @ResponseBody
    public ReturnUtil findAllLevel(){
        return ReturnUtil.ok(education_levelService.findAllLevel());
    }
}
