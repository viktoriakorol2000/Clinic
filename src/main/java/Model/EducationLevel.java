package Model;

public class EducationLevel {
    private String name;

    public EducationLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EducationLevel{" +
                "name='" + name + '\'' +
                '}';
    }
}
