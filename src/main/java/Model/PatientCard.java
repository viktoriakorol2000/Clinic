package Model;

import java.util.Date;

public class PatientCard {
    private String name;
    private String surName;
    private Date birthdate;

    public PatientCard(String name, String surName, Date birthdate) {
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
