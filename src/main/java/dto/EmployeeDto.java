package dto;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "EMPLOYEE_NAME", length = 50, nullable = false, unique = false)
    private String name;
    @Column(name = "EMPLOYEE_SURNAME", length = 50, nullable = false, unique = false)
    private String surname;
    @OneToMany(mappedBy = "id")
    DepartmentDto departmentDto;

    public EmployeeDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
