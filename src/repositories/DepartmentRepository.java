package repositories;

import models.Department;
import models.Specialty;

import java.util.LinkedHashMap;
import java.util.Map;

public class DepartmentRepository {

    private Map<String, Department> departments;


    public DepartmentRepository() {
        this.departments = new LinkedHashMap<>();

    }
}
