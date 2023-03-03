package listOfStudentApp.comparing;

import listOfStudentApp.Student;

import java.util.Comparator;

public class ComparingByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge()==0? (int) (o1.getScore() - o2.getScore()) :o1.getAge()-o2.getAge();
    }
}
