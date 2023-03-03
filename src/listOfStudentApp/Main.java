package listOfStudentApp;

public class Main {
    public static void main(String[] args) {
        try {
            Service.operation();
        }catch (RuntimeException exp){
            System.err.println(exp.getMessage());
        }
    }
}
