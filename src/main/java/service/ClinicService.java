package service;

import domain.Clinic;
import dto.DepartmentDto;
import dto.EmployeeDto;
import dto.PatientDto;
import dto.VisitDto;

import java.util.Date;

public class ClinicService {
    private final Clinic clinic;

    public ClinicService(Clinic clinic) {
        this.clinic = clinic;
        System.out.println("Добро пожаловать в Клинику");
    }
}
