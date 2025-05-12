/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Expense;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.bl.ExpenseFacadeLocal;
import za.ac.tut.entities.bl.StudentFacadeLocal;

/**
 *
 * @author Tshegogatso
 */
public class FindStudentServlet extends HttpServlet {
    @EJB 
    private StudentFacadeLocal sfl;

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long studno = Long.parseLong(request.getParameter("studno"));
        
        Student stud = sfl.find(studno);
        request.setAttribute("expense", stud);
        
         RequestDispatcher disp = request.getRequestDispatcher("find_student_outcome.jsp");
        disp.forward(request, response);
       
    }

    

}
