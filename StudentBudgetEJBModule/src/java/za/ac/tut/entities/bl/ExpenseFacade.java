/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Expense;

/**
 *
 * @author Tshegogatso
 */
@Stateless
public class ExpenseFacade extends AbstractFacade<Expense> implements ExpenseFacadeLocal {

    @PersistenceContext(unitName = "StudentBudgetDBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExpenseFacade() {
        super(Expense.class);
    }
    
}
