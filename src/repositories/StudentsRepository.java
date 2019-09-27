package repositories;

import constants.CommonConstants;
import models.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
public class StudentsRepository {

    private static final String INPUT_PATH = "C:\\Users\\smL\\Desktop\\JAVA Project in GitHub\\Universited_Project\\files\\result.txt";

    private Map<Integer, Student> students;
    //private BufferedReader readerFile;
    private BufferedWriter writeFile;
    //private PrintWriter printWriter;

    public StudentsRepository() throws IOException {
        this.students = new LinkedHashMap<>();
        this.writeFile = new BufferedWriter(new FileWriter(INPUT_PATH, true)); //Ако имаме true означава, че файлът ще се дописва на всяко пускане на програмата.
        //this.printWriter = new PrintWriter(INPUT_PATH);
    }

    public void addStudent(Student student) {
        if (this.students.containsKey(student.getId())) {
            throw new IllegalArgumentException(CommonConstants.THIS_STUDENT_EXIST);
        } else {
            this.students.put(student.getId(), student);
        }
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public BufferedWriter getWriteFile() {
        return writeFile;
    }

    public void writeInFile(String str) throws IOException {
        this.writeFile.write(str);
    }

    //TEST
    public void removeContentOfRepository() throws IOException {
        FileWriter fw = new FileWriter(INPUT_PATH);
        PrintWriter pw = new PrintWriter(fw);
        pw.write("");
        pw.flush();
        pw.close();
    }
}
