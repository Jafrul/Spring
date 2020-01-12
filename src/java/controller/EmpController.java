/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.EmpService;

/**
 *
 * @author bilt
 */
@Controller
@RequestMapping("/empc/")
public class EmpController {

    @Autowired
    EmpService empService;

    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public String addUser( @ModelAttribute() Employee employee) throws Exception {
        //  response.sendRedirect("userAddSuccess.jsp");

        
        System.out.println(employee);
        
        empService.addEmployee(employee);
        return "add-emp-success";
    }

    @RequestMapping(value = "/edit_employee", method = RequestMethod.GET)
    public String editUser() throws Exception {
        // response.sendRedirect("userEditSuccess.jsp");
        return "edit-emp-success";
    }

    @RequestMapping(value = "/delete_employee", method = RequestMethod.GET)
    public String deleteUser() throws Exception {
        return "emp-del-success";
        // response.sendRedirect("userDeleteSuccess.jsp");
    }

    @RequestMapping(value = "/list_employee", method = RequestMethod.GET)
    public String listUser(ModelMap model , HttpServletResponse rs, HttpServletRequest rq) throws Exception {
        List<Employee> empList = empService.getEmpList();
        model.addAttribute("empList", empList);
        return "list-emp";
    }

}
