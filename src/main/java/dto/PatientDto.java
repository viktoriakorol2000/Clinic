package dto;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class PatientDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="PATIENT_NAME", length=50, nullable=false, unique=false)
    private String name;
    @Column(name="PATIENT_SURNAME", length=50, nullable=false, unique=false)
    private String surName;
    @Column(name="PATIENT_BIRTHDATE", length=50, nullable=false, unique=false)
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
