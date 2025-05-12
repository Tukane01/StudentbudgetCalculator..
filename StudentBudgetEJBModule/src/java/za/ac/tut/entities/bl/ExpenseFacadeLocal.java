/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Expense;

/**
 *
 * @author Tshegogatso
 */
@Local
public interface ExpenseFacadeLocal {

    void create(Expense expense);

    void edit(Expense expense);

    void remove(Expense expense);

    Expense find(Object id);

    List<Expense> findAll();

    List<Expense> findRange(int[] range);

    int count();
    
}
