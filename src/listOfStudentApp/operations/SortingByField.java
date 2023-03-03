package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;
import listOfStudentApp.comparing.*;
import listOfStudentApp.enums.SortFields;

import java.util.Collections;
import java.util.List;

public class SortingByField {

    public static void sortByField(List<Student> students) {//done
        System.out.println("Choose field for sorting (id, name, surname, age, score, birthdate, admissionDate)");
        System.out.println("Type sorting field:");
        try {
            SortFields sf = SortFields.valueOf(Service.scan.next().toUpperCase());

            switch (sf) {
                case SURNAME:
                    ComparingBySurName surName = new ComparingBySurName();
                    Collections.sort(students, surName);
                    System.out.println("List was sorted by surname");
                    ShowingStudents.showStudents();
                    break;
                case AGE:
                    ComparingByAge age = new ComparingByAge();
                    Collections.sort(students, age);
                    System.out.println("List was sorted by age");
                    ShowingStudents.showStudents();
                    break;
                case SCORE:
                    ComparingByScore score = new ComparingByScore();
                    Collections.sort(students, score);
                    System.out.println("List was sorted by score");
                    ShowingStudents.showStudents();
                    break;
                case ID:
                    ComparingByID id = new ComparingByID();
                    Collections.sort(students, id);
                    System.out.println("List was sorted by ID");
                    ShowingStudents.showStudents();
                    break;
                case BIRTHDATE:
                    ComparingByBirthDate birthDate = new ComparingByBirthDate();
                    Collections.sort(students, birthDate);
                    System.out.println("List was sorted by birthday");
                    ShowingStudents.showStudents();
                case ADMISSIONDATE:
                    ComparingAdmissionDate admissionDate = new ComparingAdmissionDate();
                    Collections.sort(students, admissionDate);
                    System.out.println("List was sorted by admission date");
                    ShowingStudents.showStudents();
                default:
                    throw new IllegalArgumentException("Invalid sort field!");
            }
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
