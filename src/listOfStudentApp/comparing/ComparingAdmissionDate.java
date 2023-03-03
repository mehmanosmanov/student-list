package listOfStudentApp.comparing;

import listOfStudentApp.Student;

import java.util.Comparator;

public class ComparingAdmissionDate implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAdmissionDate().compareTo(o2.getAdmissionDate());
    }
}
