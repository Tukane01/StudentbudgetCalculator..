/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.bl.StudentFacadeLocal;

/**
 *
 * @author Tshegogatso
 */
public class AddStudentServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal sfl;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Long studno = Long.parseLong(request.getParameter("studno"));
        Double allowance = Double.parseDouble(request.getParameter("allowance"));
        String bursary= request.getParameter("bursary");
        LocalDate allowanceDate = LocalDate.parse(request.getParameter("allowanceDate"));
       
        
        Student student = createStudent(name,surname,studno,allowance,bursary,allowanceDate);
        sfl.create(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_student_outcome.jsp");
        disp.forward(request, response);
      
    }
public Student createStudent(String name, String surname, Long studno, Double allowance, String bursary, LocalDate allowanceDate){
    
    Student s= new Student();
    
  
    s.setName(name);
    s.setSurname(surname);
    s.setStudentNumber(studno);
    s.setAllowance(allowance);
    s.setBursary(bursary);
    s.setDate(allowanceDate);
    
    return s;
 
}
    

}
