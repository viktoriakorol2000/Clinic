package Model;

import java.util.ArrayList;

public class Department {
    private Specialization specialization;
    private ArrayList<Employee> employees;

    public Department(Specialization specialization, ArrayList<Employee> employees) {
        this.specialization = specialization;
        this.employees = employees;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Специализация отделения: "+specialization + "\nСотрудники: " + employees;
    }
}
