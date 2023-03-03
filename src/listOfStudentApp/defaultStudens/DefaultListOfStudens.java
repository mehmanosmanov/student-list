package listOfStudentApp.defaultStudens;

import listOfStudentApp.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DefaultListOfStudens {

    private static List<Student> list=new ArrayList<>();

    public static List<Student> studens() {
        list.add(new Student.StudentBuilder()
                .setAge(26)
                .setName("Mehman")
                .setSurname("Osmamov")
                .setScore(480.0)
                .setBirthDate(LocalDate.of(1996, 9, 1))
                .setAdmissionDate(LocalDate.of(2018, 9, 15))
                .build()
        );
        list.add(new Student.StudentBuilder()
                .setAge(19)
                .setName("Eshref")
                .setSurname("Shukurlu")
                .setScore(566.0)
                .setBirthDate(LocalDate.of(2003, 9, 1))
                .setAdmissionDate(LocalDate.of(2020, 9, 15))
                .build()
        );
        list.add(new Student.StudentBuilder()
                .setAge(32)
                .setName("Cavid")
                .setSurname("Haciyev")
                .setScore(480.0)
                .setBirthDate(LocalDate.of(1990, 9, 1))
                .setAdmissionDate(LocalDate.of(2010, 9, 15))
                .build()
        );
        list.add(new Student.StudentBuilder()
                .setAge(22)
                .setName("Fariz")
                .setSurname("Hesenov")
                .setScore(403.0)
                .setBirthDate(LocalDate.of(2000, 9, 1))
                .setAdmissionDate(LocalDate.of(2018, 9, 15))
                .build()
        );
        list.add(new Student.StudentBuilder()
                .setAge(29)
                .setName("Nicat")
                .setSurname("Quliyev")
                .setScore(501.0)
                .setBirthDate(LocalDate.of(1993, 9, 1))
                .setAdmissionDate(LocalDate.of(2010, 8, 15))
                .build()
        );
        list.add(new Student.StudentBuilder()
                .setAge(32)
                .setName("Konul")
                .setSurname("Esedova")
                .setScore(655.0)
                .setBirthDate(LocalDate.of(1990, 5, 1))
                .setAdmissionDate(LocalDate.of(2008, 12, 15))
                .build()
        );
        list.add(new Student.StudentBuilder()
                .setAge(18)
                .setName("Ayhan")
                .setSurname("Baxseliyev")
                .setScore(466.0)
                .setBirthDate(LocalDate.of(2004, 9, 1))
                .setAdmissionDate(LocalDate.of(2020, 9, 15))
                .build()
        );
        return list;
    }
}
