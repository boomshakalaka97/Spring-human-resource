package com.wy.Service;

import com.wy.Dao.EmployeeDao;
import com.wy.Entity.Employee;
import com.wy.Util.IdUtil;
import com.wy.Util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public ReturnUtil addEmployee(Employee employee) {

            Employee new_employee = new Employee();
            new_employee.setEmid(IdUtil.generateId());
            new_employee.setEmname(employee.getEmname());
            new_employee.setSex(employee.getSex());
            new_employee.setDepartId(employee.getDepartId());
            new_employee.setLevelId(employee.getLevelId());
            new_employee.setPostId(employee.getPostId());
            new_employee.setAddress(employee.getAddress());
            new_employee.setDatecome(employee.getDatecome());
            new_employee.setRankId(employee.getRankId());
            new_employee.setBirth(employee.getBirth());
            new_employee.setBirthplace(employee.getBirthplace());
            new_employee.setNatureWork(employee.getNatureWork());
            new_employee.setMarriage(employee.getMarriage());
            new_employee.setNation(employee.getNation());
            new_employee.setSchool(employee.getSchool());
            new_employee.setSituation(employee.getSituation());
            new_employee.setIdnum(employee.getIdnum());
            employeeDao.save(new_employee);


        return ReturnUtil.ok(new_employee);
    }
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
