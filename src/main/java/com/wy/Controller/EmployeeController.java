package com.wy.Controller;

import com.wy.Entity.Employee;
import com.wy.Service.EmployeeService;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value="/add")
    @ResponseBody//录入
    public ReturnUtil checkIn(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @PostMapping(value="/findByNature_work")
    @ResponseBody
    public ReturnUtil findEmployeeByNature_work(@RequestBody Employee employee){
        return employeeService.findEmployeeByNature_work(employee.getNatureWork());
    }

    @PostMapping(value="/findAllEmployee")
    @ResponseBody
    public ReturnUtil findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @PostMapping(value="/findBySituation")
    @ResponseBody
    public ReturnUtil findBySituation(@RequestBody Employee employee){
        return employeeService.findBySituation(employee.getSituation());
    }

    /*@PostMapping(value="/findBySituationConnect")
    @ResponseBody
    public ReturnUtil findBySituationConnect(@RequestBody Employee employee){

    }

    @PostMapping(value="/findByNature_workConnect")
    @ResponseBody
    public ReturnUtil findByNature_workConnect(@RequestBody Employee employee){

    }

    @PostMapping(value="/findAllEmployeeConnect")
    @ResponseBody
    public ReturnUtil findAllEmployeeConnect(@RequestBody Employee employee){

    }*/
}
