package listOfStudentApp.comparing;

import listOfStudentApp.Student;

import java.util.Comparator;

public class ComparingBySurName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getSurname().compareTo(o2.getSurname()) == 0)
            return o1.getName().compareTo(o2.getName());
        else
            return o1.getSurname().compareTo(o2.getSurname());

    }
}

