package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;

public class ShowingStudents {
    public static void showStudents() {//done
        if (Service.students == null) {
            System.out.println("Students list is empty");
        } else {
            for (Student s : Service.students)
                System.out.println(s);
        }
        Service.operation();
    }
}
