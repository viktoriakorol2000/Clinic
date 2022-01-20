package dto;

import java.util.Date;

public class VisitDto {
    private PatientDto patient;
    private EmployeeDto employee;
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
