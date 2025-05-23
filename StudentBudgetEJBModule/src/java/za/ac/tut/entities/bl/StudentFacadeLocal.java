/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Student;

/**
 *
 * @author Tshegogatso
 */
@Local
public interface StudentFacadeLocal {

    void create(Student student);
    void edit(Student student);
    void remove(Student student);
    Student findByName(String name, String surname);
    Student find(Object id);
    List<Student> findAll();
    List<Student> findStudentsByAllowance(Double minAllowance, Double maxAllowance);
    List<Student> findRange(int[] range);
    int count();
    
}
