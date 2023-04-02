package listOfStudentApp.operations;

import listOfStudentApp.enums.SortFields;
import listOfStudentApp.Service;
import listOfStudentApp.Student;

import java.util.Comparator;

public class SortingByField {

    public static Comparator<Student> sortByField() {//done
        System.out.println("Choose field for sorting (id, surname, age, score, birthdate, admissionDate)");
        System.out.println("Type sorting field:");

        SortFields sortField = SortFields.valueOf(Service.scan.next().toUpperCase());

        switch (sortField) {
            case ID:
                System.out.println("List was sorted by ID");
                return (Student s1, Student s2) -> (int) (s1.getID() - s2.getID());
            case SURNAME:
                System.out.println("List was sorted by surname");
                return (Student o1, Student o2) -> {
                    if (o1.getSurname().compareTo(o2.getSurname()) == 0) return o1.getName().compareTo(o2.getName());
                    else return o1.getSurname().compareTo(o2.getSurname());
                };
            case AGE:
                System.out.println("List was sorted by age");
                return Comparator.comparing(Student::getAge).reversed();
            case SCORE:
                System.out.println("List was sorted by score");
                return Comparator.comparing(Student::getScore).reversed();
            case BIRTHDATE:
                System.out.println("List was sorted by birthdate");
                return Comparator.comparing(Student::getBirthDate).reversed();
            case ADMISSIONDATE:
                System.out.println("List was sorted by admission date");
                return Comparator.comparing(Student::getAdmissionDate).reversed();
            default:
                throw new IllegalArgumentException("Invalid sort field!");
        }
    }
}
