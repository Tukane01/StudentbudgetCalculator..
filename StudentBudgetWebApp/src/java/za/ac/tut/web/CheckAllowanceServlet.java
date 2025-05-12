/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.bl.ExpenseFacadeLocal;
import za.ac.tut.entities.bl.StudentFacadeLocal;

/**
 *
 * @author Tshegogatso
 */
public class CheckAllowanceServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal sfl;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Double minAmount = Double.parseDouble(request.getParameter("min"));
        Double maxAmount= Double.parseDouble(request.getParameter("max"));
        
        List<Student> list = sfl.findStudentsByAllowance(minAmount, maxAmount);
        request.setAttribute("list", list);
        
        RequestDispatcher disp = request.getRequestDispatcher("check_allowance_outcome.jsp");
        disp.forward(request, response);
    }

   

}
