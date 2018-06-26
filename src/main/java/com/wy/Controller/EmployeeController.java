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
    public ReturnUtil addEmployee(@RequestBody Employee employee) {
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

    @PostMapping(value="/findByEmid")
    @ResponseBody
    public ReturnUtil findByEmid(@RequestBody Employee employee){
        return employeeService.findByEmid(employee.getEmid());
    }

    @PostMapping(value="/findEmployeeVague")
    @ResponseBody
    public ReturnUtil findEmployeeVague(@RequestBody Employee employee){
        return employeeService.findByEmnameVague(employee.getEmname());
    }

    @PostMapping(value="/update")
    @ResponseBody//录入
    public ReturnUtil updateEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PostMapping(value="/delete")
    @ResponseBody//录入
    public ReturnUtil deleteEmployee(@RequestBody Employee employee) {
        return employeeService.deleteEmployee(employee);
    }

}
