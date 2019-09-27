package models;

import constants.CommonConstants;

public class Student extends Person {

    private double avgYearGrade;

    public Student(String firstName, String lastName, int age, String department) {
        super(firstName, lastName, age, department);
        this.avgYearGrade = CommonConstants.DEFAULT_AVG_YEAR_GRADE;
    }

    public void setAvgYearGrade(double avgYearGrade) {
        this.avgYearGrade = avgYearGrade;
    }


    @Override
    public String toString() {
        String str = super.toString();
        return String.format("%s %.2f", str, this.avgYearGrade) + System.lineSeparator();
    }
}
