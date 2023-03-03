package listOfStudentApp;

import listOfStudentApp.defaultStudens.DefaultListOfStudens;
import listOfStudentApp.exceptions.AgeLimit;
import listOfStudentApp.operations.*;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public final class Service {
    public static List<Student> students = DefaultListOfStudens.studens();

    public static Scanner scan = new Scanner(System.in);

    public static void operation() {
        System.out.println("\n...Please enter operation...");
        System.out.println("Press 1: Show all students," +
                "\nPress 2: Sort and show students, " +
                "\nPress 3: Add student, " +
                "\nPress 4: Show student by id," +
                "\nPress 5: Delete student by id," +
                "\nPress 6: Update student by id, " +
                "\nPress 7: Exit..\n");
        while (true) {
            String a = scan.next();
            switch (a) {
                case "1":
                    Collections.sort(students);
                    ShowingStudents.showStudents();
                    break;
                case "2":
                    SortingByField.sortByField(students);
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
                    AppExit.exit();
                default:
                    throw new IllegalArgumentException("Press correct operation!");
            }
        }
    }
}
