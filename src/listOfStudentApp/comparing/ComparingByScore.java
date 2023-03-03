package listOfStudentApp.comparing;

import listOfStudentApp.Student;

import java.util.Comparator;

public class ComparingByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getScore() -o1.getScore()== 0)
            return o1.getAge() - o2.getAge();
        else
            return (int) ( o2.getScore()-o1.getScore());
    }
}
