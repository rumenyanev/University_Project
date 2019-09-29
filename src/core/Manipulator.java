package core;

import models.Student;
import repositories.StudentsRepository;
import validators.Validator;
import visual.BaseStageController;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Manipulator implements Runnable {

    private StudentsRepository studentsRepository;
    private String oneStudentData;

    public Manipulator() throws IOException {
        this.studentsRepository = new StudentsRepository();
        this.oneStudentData = null;
    }

    public void setOneStudentData(String oneStudent) {
        this.oneStudentData = oneStudent;
    }

    public void takeDateFromForm(String oneStudentData) {
        this.oneStudentData = oneStudentData;
    }

    @Override
    public void run() {
        String data = this.oneStudentData;
        String[] studentData = data.split(", ");
        Student student = new Student(studentData[0], studentData[1],
                Integer.parseInt(studentData[2]), studentData[3]);
        this.studentsRepository.addStudent(student);
        this.writeStudentInFile(student.toString());

    }

    private void writeStudentInFile(String oneStudentAsString) {
        try {
            this.studentsRepository.writeInFile(oneStudentAsString);
            this.studentsRepository.getWriteFile().close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Файлът трябва да се затвори, след края на писането в него.
        try {
            this.studentsRepository.getWriteFile().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeContentOfFile() throws IOException {
        this.studentsRepository.removeContentOfRepository();
    }
}