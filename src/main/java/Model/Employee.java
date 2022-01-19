package Model;

public class Employee {
    private String name;
    private String surname;
    private EducationLevel educationLevel;

    public Employee(String name, String surname, EducationLevel educationLevel) {
        this.name = name;
        this.surname = surname;
        this.educationLevel = educationLevel;
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

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", educationLevel=" + educationLevel +
                '}';
    }
}
