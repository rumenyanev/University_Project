package core;

import models.Student;
import repositories.StudentsRepository;
import validators.Validator;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Manipulator_old implements Runnable {

    private StudentsRepository studentsRepository;

    public Manipulator_old() throws IOException {
        this.studentsRepository = new StudentsRepository();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        //vyvejdame informacia za student i syzdavame edin student
        //vyvejdame informacia za prepodavatel i syzdavame takyv
        //vyvejdame informacia i syzdavame edna specialnost
        //vyvejdame informacia i syzdavame edin fakultet
        //vyvejdame informacia i syzdavame edin universitet


        while (true) {
            System.out.print("Въведете името на студента: ");
            String nameStudent = scanner.nextLine();
            Validator.invalidName(nameStudent);
            System.out.print("Въведете фамилията на студента: ");
            String lastNameStudent = scanner.nextLine();
            System.out.print("Въведете години на студента: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Въведете факултета на студента: ");
            String departmentStudent = scanner.nextLine();

            Student student = new Student(nameStudent, lastNameStudent, age, departmentStudent);

            System.out.print("Въведете електронната поща на студента: ");
            String studentEmail = scanner.nextLine();

            if (!(studentEmail == null || studentEmail.trim().isEmpty())) {
                try {
                    student.setEmail(studentEmail);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            this.studentsRepository.addStudent(student);

            System.out.print("Искате ли да въведете нов студент? :");
            String answer = scanner.nextLine();
            if (!answer.equals("yes")) {
                break;
            }
        }


        for (Map.Entry<Integer, Student> oneStudent : this.studentsRepository.getStudents().entrySet()) {
            String oneStudentAsString = oneStudent.getValue().toString();
            try {
                this.studentsRepository.writeInFile(oneStudentAsString);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
