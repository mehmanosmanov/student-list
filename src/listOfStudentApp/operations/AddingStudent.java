package listOfStudentApp.operations;

import listOfStudentApp.Service;
import listOfStudentApp.Student;
import listOfStudentApp.exceptions.AgeLimit;

import java.time.LocalDate;

public class AddingStudent {

    public static void addStudent() {//done
        System.out.println("Please add the student's info...");
        System.out.println("Student's name:");
        String name = Service.scan.next();
        System.out.println("Student's surname:");
        String surName = Service.scan.next();
        System.out.println("Student's age:");
        int age = Service.scan.nextInt();
        if (age < 17)
            throw new AgeLimit("Age limit exception");
        System.out.println("Student's score:");
        double score = Service.scan.nextDouble();
        System.out.println("Birthdate:");
        LocalDate birthdate = LocalDate.of(Service.scan.nextInt(), Service.scan.nextInt(), Service.scan.nextInt());
        if (birthdate.isAfter(LocalDate.of(2005, 1, 1)))
            throw new AgeLimit("Entered birthdate is less than age limit");
        System.out.println("Admission date:");
        LocalDate admissionDate = LocalDate.of(Service.scan.nextInt(), Service.scan.nextInt(), Service.scan.nextInt());

        Service.students.add(new Student.StudentBuilder()
                .setName(name)
                .setSurname(surName)
                .setAge(age)
                .setScore(score)
                .setBirthDate(birthdate)
                .setAdmissionDate(admissionDate)
                .build());

        System.out.println("Student is added successfully!");
        Service.operation();

    }
}
