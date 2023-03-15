package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;
public class DeletingByID {
    public static void deleteById() {//done
        Student s = GettingByID.getByID();
        if (s != null) {
            System.out.println(s.getName()+" "+s.getSurname() + " is deleted..");
            Service.students.remove(s);
        } else
            throw new RuntimeException("Invalid ID entered");
        Service.operation();
    }
}
