package models;

import constants.CommonConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("CanBeFinal")
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int id;
    private String department;

    private static int count = 0;
    //private double avgGradeYear;


    Person(String firstName, String lastName, int age, String department) {
        count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = count;
        this.department = department;
        this.email = CommonConstants.NO_EMAIL;
    }

    public void setEmail(String email) {
        String regex = "^.+@.+\\.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()){
            this.email = email;
        }else{
            throw new IllegalArgumentException(CommonConstants.INVALID_EMAIL);
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %s %s",
                this.firstName,
                this.lastName,
                this.age,
                this.id,
                this.department,
                this.email);
    }
}
