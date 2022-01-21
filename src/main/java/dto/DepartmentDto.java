package dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class DepartmentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="DEPARTMENT_NAME", length=50, nullable=false, unique=false)
    private String name;
    @OneToMany(mappedBy = "departmentDto")
    private List<EmployeeDto> employees;
    @OneToMany(mappedBy = "id")
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
