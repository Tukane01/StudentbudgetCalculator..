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
public class AddExpensesServlet extends HttpServlet {
    @EJB
    private ExpenseFacadeLocal efl;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String studno=request.getParameter("studno");
        String categories = request.getParameter("categories");
        Double amount = Double.parseDouble(request.getParameter("amount"));
        
        Expense exp= createExpenses(studno,categories,amount);
        efl.create(exp);
        
        RequestDispatcher disp= request.getRequestDispatcher("add_expenses_outcome.jsp");
        disp.forward(request, response);
        
    }

    public Expense createExpenses(String studno, String categories, double amount){
        Expense exp = new Expense();
        
        exp.setStudentNumber(studno);
        exp.setCategory(categories);
        exp.setAmount(amount);
        
        return exp;
    }

}
