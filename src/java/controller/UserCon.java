/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author bilt
 */
@WebServlet(name = "UserCon", urlPatterns = {"/UserCon/*"})
public class UserCon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String job = request.getPathInfo();

            switch (job) {
                case "/add":
                    addUser(request, response);
                    break;

                case "/edit":
                    editUser(request, response);
                    break;

                case "/delete":
                    deleteUser(request, response);
                    break;

                case "/list":
                    listUser(request, response);
                    break;

                default:
                    throw new AssertionError();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
        
        response.getWriter().println("user added");
      //  response.sendRedirect("userAddSuccess.jsp");
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
     
                response.getWriter().println("user edited");

       // response.sendRedirect("userEditSuccess.jsp");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
     
                response.getWriter().println("user deleted");

       // response.sendRedirect("userDeleteSuccess.jsp");
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
       
                response.getWriter().println("user list");

       // response.sendRedirect("userList.jsp");
    }

}
