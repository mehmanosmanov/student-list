package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;

public class GettingByID {

    public static Student getByID() {
        System.out.println("Enter the ID of the student");
        long id = Service.scan.nextLong();
        for (Student s : Service.students)
            if (s.getID() == id)
                return s;
        return null;
    }
}
