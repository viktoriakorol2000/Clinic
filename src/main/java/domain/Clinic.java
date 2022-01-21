package domain;

import dto.DepartmentDto;
import dto.EmployeeDto;
import dto.PatientDto;
import dto.VisitDto;

import java.util.List;

public class Clinic {
    private List<PatientDto> patients;
    private List<DepartmentDto> departments;

    public Clinic(List<PatientDto> patients, List<DepartmentDto> departments) {
        this.patients = patients;
        this.departments = departments;
    }

    public List<PatientDto> getPatients() {
        return patients;
    }

    public List<DepartmentDto> getDepartments() {
        return departments;
    }

    public void addVisit(DepartmentDto department, PatientDto patient, EmployeeDto employee, String date) {
        VisitDto visit = new VisitDto(patient, employee, date);
        department.addVisit(visit);
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "patients=" + patients +
                ", departments=" + departments +
                '}';
    }
}
