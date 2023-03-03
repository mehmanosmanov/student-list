package listOfStudentApp;

import listOfStudentApp.exceptions.AgeLimit;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
    //This class provides builder pattern;
    private static long statID = 100;
    private long ID;
    private String name;
    private String surname;
    private int age;
    private double score;
    private LocalDate birthDate;
    private LocalDate admissionDate;


    //id, name, surname, age, score, birthdate, admissionDate

    private Student(String name, String surname, int age, double score, LocalDate birthDate, LocalDate admissionDate) {
        this.ID = statID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.score = score;
        this.birthDate = birthDate;
        this.admissionDate = admissionDate;
        statID += 11;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age < 17)
            throw new AgeLimit("Age limit exception");
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", " + name + " " + surname + ", age:" + age + ", score:" + score + ", birthdate:" + birthDate + ", admissionDate:" + admissionDate;
    }

    @Override
    public int hashCode() {
        return (int) ID;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName()) == 0 ? this.surname.compareTo(o.getSurname()) : this.name.compareTo(o.getName());
    }

    public static class StudentBuilder {
        private String name;
        private String surname;
        private int age;
        private double score;
        private LocalDate birthDate;
        private LocalDate admissionDate;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setScore(double score) {
            this.score = score;
            return this;
        }

        public StudentBuilder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public StudentBuilder setAdmissionDate(LocalDate admissionDate) {
            this.admissionDate = admissionDate;
            return this;
        }

        public Student build() {
            return new Student(name, surname, age, score, birthDate, admissionDate);
        }

    }
}

