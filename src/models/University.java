package models;

import java.util.LinkedHashMap;
import java.util.Map;

public class University {
    private String name;
    private Map<String, Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Department> getDepartments() {
        return departments;
    }
}
