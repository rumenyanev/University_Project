package models;

class Lecturer extends Person {
    private String title;

    public Lecturer(String firstName, String lastName, int age, String department, String title ) {
        super(firstName, lastName, age, department);
          this.title = title;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return String.format("%s %s",title, str ) + System.lineSeparator();
    }
}
