package com.wy.Controller;

import com.wy.Entity.Depart;
import com.wy.Service.DepartService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value="/depart")
public class DepartController {
    @Autowired
    DepartService departService;

    @PostMapping(value="/add")
    @ResponseBody
    public ReturnUtil addDepart(@RequestBody Depart depart){
        departService.addDepart(depart);
        return ReturnUtil.ok();
    }

    @PostMapping(value="/delete")
    @ResponseBody
    public void deleteDepart(@RequestBody Depart depart){
        departService.deleteDepart(depart);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public void updateDepart(@RequestBody Depart depart){
        departService.updateDepart(depart);
    }

    @PostMapping(value="/find")
    @ResponseBody
    public Depart findDepart(@RequestBody Depart depart){
        return departService.findDepart(depart);
    }

    @PostMapping(value="/findAllDepart")
    @ResponseBody
    public ReturnUtil findAllDepart(){
        return ReturnUtil.ok(departService.findAllDepart());
    }

    @PostMapping(value="/findDepartVague")
    @ResponseBody
    public ReturnUtil findDepartVague(@RequestBody Depart depart){
        return ReturnUtil.ok(departService.findDepartVague(depart.getDepartName()));
    }
}
