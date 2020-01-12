/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Employee;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bilt
 */
@Repository
public class EmpRepository {

    public void addEmployee(Employee emp) {
        System.out.println("employee created");
    }

    public List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<>();
        Employee emp = new Employee();
        emp.setAddress("dhaka");
        emp.setName("sumon");
        empList.add(emp);
        return empList;
    }

}
