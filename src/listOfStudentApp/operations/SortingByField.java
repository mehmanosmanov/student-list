package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;
import listOfStudentApp.comparing.*;
import listOfStudentApp.enums.SortFields;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByField {

    public static Comparator<Student> sortByField(List<Student> students) {//done
        System.out.println("Choose field for sorting (id, name, surname, age, score, birthdate, admissionDate)");
        System.out.println("Type sorting field:");

        SortFields sf = SortFields.valueOf(Service.scan.next().toUpperCase());

        switch (sf) {
            case SURNAME:
                System.out.println("List was sorted by surname");
                return new ComparingBySurName();
            case AGE:
                System.out.println("List was sorted by age");
                return new ComparingByAge();
            case SCORE:
                System.out.println("List was sorted by score");
                return new ComparingByScore();
            case ID:
                System.out.println("List was sorted by ID");
                return new ComparingByID();
            case BIRTHDATE:
                System.out.println("List was sorted by birthdate");
                return new ComparingByBirthDate();
            case ADMISSIONDATE:
                System.out.println("List was sorted by admission date");
                return new ComparingAdmissionDate();
            default:
                throw new IllegalArgumentException("Invalid sort field!");

        }
    }
}
