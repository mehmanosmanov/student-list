package listOfStudentApp.comparing;

import listOfStudentApp.Student;

import java.util.Comparator;

public class ComparingByID implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (int) (s1.getAge() - s2.getAge());
    }
}
