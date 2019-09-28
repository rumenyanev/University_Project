package repositories;

import models.Specialty;

import java.util.LinkedHashMap;
import java.util.Map;

public class SpecialityRepository {
    private Map<String , Specialty> specialtyMap;

    public SpecialityRepository() {
        this.specialtyMap = new LinkedHashMap<>();
    }

    public Map<String, Specialty> getSpecialtyMap() {
        return specialtyMap;
    }
}
