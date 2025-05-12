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
import za.ac.tut.entities.Expense;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.bl.ExpenseFacadeLocal;

/**
 *
 * @author Tshegogatso
 */
public class GetExpenseListServlet extends HttpServlet {
    @EJB 
    private ExpenseFacadeLocal efl;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Expense> list = efl.findAll();
        request.setAttribute("list",list);
        
        RequestDispatcher disp = request.getRequestDispatcher("expense_list_outcome.jsp");
        disp.forward(request, response);
    }

    

}
