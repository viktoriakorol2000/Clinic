package dto;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDto {
    private String name;
    private List<EmployeeDto> employees;
    private List<VisitDto> visits = new ArrayList<>();

    public DepartmentDto(String name) {
        this.name = name;
    }

    public void addVisit(VisitDto visit) {
        this.visits.add(visit);
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }

    public List<VisitDto> getVisits() {
        return visits;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", visits=" + visits +
                '}';
    }
}
