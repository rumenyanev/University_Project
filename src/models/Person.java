package models;

import constants.CommonConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("CanBeFinal")
public class Person {

    private static int count = 0;

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private int age;
    private String department;

    public Person(int id, String firstName, String lastName, int age, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = "-";
        this.email = "-";
        this.age = age;
        this.department = department;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        String regex = "^.+@.+\\.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            this.email = email;
        } else {
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
