package com.wy.Service;

import com.wy.Dao.EmployeeDao;
import com.wy.Entity.Employee;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public ReturnUtil findEmployeeByNature_work(String Nature_work){
        List<Employee> employeeList=employeeDao.findByNatureWork(Nature_work);
        return ReturnUtil.ok(employeeList);
    }
    public ReturnUtil findAllEmployee(){
        List<Employee> employeeList=employeeDao.findAll();
        return ReturnUtil.ok(employeeList);
    }
    public ReturnUtil findBySituation(String Nature_work){
        List<Employee> employeeList=employeeDao.findBySituation(Nature_work);
        return ReturnUtil.ok(employeeList);
    }
}
