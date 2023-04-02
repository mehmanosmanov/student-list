package listOfStudentApp.operations;

import listOfStudentApp.enums.SortFields;
import listOfStudentApp.Service;
import listOfStudentApp.Student;

import java.util.Comparator;
import java.util.List;

public class SortingByField {

    public static Comparator<Student> sortByField(List<Student> students) {//done
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
                return (Student o1, Student o2) -> (o1.getAge() - o2.getAge() == 0 ? (int) (o1.getScore() - o2.getScore()) : o1.getAge() - o2.getAge());
            case SCORE:
                System.out.println("List was sorted by score");
                return Comparator.comparing(Student::getScore);
            case BIRTHDATE:
                System.out.println("List was sorted by birthdate");
                return Comparator.comparing(Student::getBirthDate);
            case ADMISSIONDATE:
                System.out.println("List was sorted by admission date");
                return Comparator.comparing(Student::getAdmissionDate);
            default:
                throw new IllegalArgumentException("Invalid sort field!");
        }
    }
}
