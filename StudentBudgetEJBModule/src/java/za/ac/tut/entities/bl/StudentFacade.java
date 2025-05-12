/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Student;

/**
 *
 * @author Tshegogatso
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "StudentBudgetDBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public List<Student> findStudentsByAllowance(Double minAllowance, Double maxAllowance) {
        return em.createQuery("SELECT s WHERE s.allowance BETWEEN :min AND MAX", Student.class)
                .setParameter("min", minAllowance)
                .setParameter("max", maxAllowance)
                .getResultList();
    }

    @Override
    public Student findByName(String name, String surname) {
        return em.createQuery("SELECT s WHERE s.name = :name AND s.surname = :surname", Student.class)
                .setParameter("name", name)
                .setParameter("surname", surname)
                .getSingleResult();
                
    }
    
    
    
}
