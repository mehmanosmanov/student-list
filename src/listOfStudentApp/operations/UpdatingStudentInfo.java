package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;
import listOfStudentApp.enums.SortFields;
import listOfStudentApp.exceptions.AgeLimit;

public class UpdatingStudentInfo {

    public static void updateStudentInfo() {
        Student s = GettingByID.getByID();
        if (s != null) {
            System.out.println("Update " + s.getName() + " " + s.getSurname() + "'s infos");
            System.out.println("Type updating fields: name, surname, age, score, score");

            SortFields sf = SortFields.valueOf(Service.scan.next().toUpperCase());
            switch (sf) {
                case NAME:
                    System.out.println("Enter new name");
                    s.setName(Service.scan.next());
                    System.out.println(s.getName() + " is a new name of " + s.getName() + " " + s.getSurname());
                    break;
                case SURNAME:
                    System.out.println("Enter new surname");
                    s.setSurname(Service.scan.next());
                    System.out.println(s.getSurname() + " is a new surname of " + s.getName() + " " + s.getSurname());
                    break;
                case AGE:
                    System.out.println("Enter new age");
                    try {
                        s.setAge(Service.scan.nextInt());
                        System.out.println(s.getAge() + " is a new age of " + s.getName() + " " + s.getSurname());
                    } catch (AgeLimit ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case SCORE:
                    System.out.println("Enter new score");
                    s.setScore(Service.scan.nextDouble());
                    System.out.println(s.getScore() + " is a new score of " + s.getName() + " " + s.getSurname());
                    break;
                default:
                    throw new IllegalArgumentException("Invalid sort field!");
            }
        }
        Service.operation();
    }
}
