package dto;

import java.util.Date;

public class PatientDto {
    private String name;
    private String surName;
    private String birthdate;

    public PatientDto(String name, String surName, String birthdate) {
        this.name = name;
        this.surName = surName;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "PatientCard{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
