package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;

public class ShowingByID {
    public static void showById() {//done
        Student s = GettingByID.getByID();
        if (s != null)
            System.out.println(s);
        else
            throw new RuntimeException("Invalid ID entered");
        Service.operation();
    }
}
