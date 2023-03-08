package listOfStudentApp;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Service.operation();
            StudentInFile.table(Service.students);
        }catch (RuntimeException exp){
            System.err.println(exp.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
