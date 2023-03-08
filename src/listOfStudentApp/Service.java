package listOfStudentApp;

import listOfStudentApp.defaultStudens.DefaultListOfStudens;
import listOfStudentApp.exceptions.AgeLimit;
import listOfStudentApp.operations.*;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public final class Service {
    public static List<Student> students;

    static {
        try {
            students = DefaultListOfStudens.studens();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Scanner scan = new Scanner(System.in);

    public static void operation() {

        while (true) {
            System.out.println("\n...Please enter operation...");
            System.out.println("Press 1: Show all students" +
                    "\nPress 2: Sort and show students" +
                    "\nPress 3: Add student" +
                    "\nPress 4: Show student by id" +
                    "\nPress 5: Delete student by id" +
                    "\nPress 6: Update student by id" +
                    "\nPress 7: Exit..\n");
            Collections.sort(students);
            String a = scan.next();
            switch (a) {
                case "1":
                    ShowingStudents.showStudents();
                    break;
                case "2":
                    try {
                        Comparator<Student> comparator = SortingByField.sortByField(students);
                        Collections.sort(students, comparator);
                        ShowingStudents.showStudents();
                    } catch (IllegalArgumentException ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case "3":
                    try {
                        AddingStudent.addStudent();
                    } catch (AgeLimit ageLimit) {
                        System.err.println(ageLimit.getMessage());
                    }
                    break;
                case "4":
                    ShowingByID.showById();
                    break;
                case "5":
                    DeletingByID.deleteById();
                    break;
                case "6":
                    UpdatingStudentInfo.updateStudentInfo();
                    break;
                case "7":
                    try {
                        StudentInFile.table(Service.students);
                        System.out.println("Student list saved on file");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    AppExit.exit();
                default:
                    throw new IllegalArgumentException("Press correct operation!");
            }
        }
    }
}
