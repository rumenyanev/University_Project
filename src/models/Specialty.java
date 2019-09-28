package models;

import java.util.ArrayList;
import java.util.List;

public class Specialty {

    private String name;
    private Lecturer lecturer;
    List<Student> students;

    public Specialty(String name,Lecturer lecturer) {
        this.name = name;
        this.lecturer = lecturer;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
