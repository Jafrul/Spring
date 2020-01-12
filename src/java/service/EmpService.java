/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmpRepository;

/**
 *
 * @author bilt
 */
@Service
public class EmpService {
    
    @Autowired
    EmpRepository empRepository;

    public void addEmployee(Employee emp) {
         empRepository.addEmployee(emp);
    }

    public List<Employee> getEmpList() {


List<Employee>  empList= empRepository.getEmpList();

return empList;

    }
}
