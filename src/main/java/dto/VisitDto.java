package dto;

import javax.persistence.*;

@Entity
@Table(name = "visit")
public class VisitDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(mappedBy = "id")
    private PatientDto patient;
    @ManyToMany(mappedBy = "id")
    private EmployeeDto employee;
    @Column(name="VISIT_DATE", length=50, nullable=false, unique=false)
    private String date;

    public VisitDto(PatientDto patient, EmployeeDto employee, String date) {
        this.patient = patient;
        this.employee = employee;
        this.date = date;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "VisitDto{" +
                "patient=" + patient +
                ", employee=" + employee +
                ", date='" + date + '\'' +
                '}';
    }
}
