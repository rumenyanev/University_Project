package models;

import java.util.List;

public class Department {

   private String name;
   private List<Specialty> specialties;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
