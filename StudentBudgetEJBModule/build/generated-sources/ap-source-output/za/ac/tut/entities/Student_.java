package za.ac.tut.entities;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T22:55:31")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> bursary;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile SingularAttribute<Student, Long> studentNumber;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Double> allowance;
    public static volatile SingularAttribute<Student, Long> id;
    public static volatile SingularAttribute<Student, LocalDate> allowanceDate;

}