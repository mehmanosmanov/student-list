package listOfStudentApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StudentInFile {

    public static void table(List<Student> list) throws IOException {
        File table = new File("C:\\Users\\user\\Desktop\\table.csv");

        try (FileWriter fw = new FileWriter(table)) {
            fw.write("ID; Name; Surname; Age; Score; Birthdate; Admission date");
            fw.write("\n");
            for (Student student : list) {
                fw.write((student.getID()) + ";");
                fw.write(student.getName() + ";");
                fw.write(student.getSurname() + ";");
                fw.write(student.getAge() + ";");
                fw.write(student.getScore() + ";");
                fw.write(student.getBirthDate() + ";");
                fw.write(student.getAdmissionDate() + ";");
                fw.write("\n");
            }
        }
    }
}
