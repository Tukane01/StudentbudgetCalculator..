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
import za.ac.tut.entities.bl.ExpenseFacadeLocal;

/**
 *
 * @author Tshegogatso
 */
public class EditStudentServlet extends HttpServlet {
    @EJB
    private ExpenseFacadeLocal efl;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long studno = Long.parseLong(request.getParameter("studno"));
        String categories = request.getParameter("categories");
        Double amount = Double.parseDouble(request.getParameter("amount"));
        
        Expense exp = createExpense(studno, categories, amount);
        efl.edit(exp);
        
        request.setAttribute("studno", studno);
        request.setAttribute("categories", categories);
        request.setAttribute("amount", amount);
        
        RequestDispatcher disp = request.getRequestDispatcher("edit_student_outcome.jsp");
        disp.forward(request, response);
        
        
    }
    
    private Expense createExpense(Long studno, String categories, Double amount){
        Expense e = efl.find(studno);
        e.setCategory(categories);
        e.setAmount(amount);
        return e;
    }

    

}
