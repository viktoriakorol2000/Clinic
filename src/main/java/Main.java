import domain.Clinic;
import dto.DepartmentDto;
import dto.EmployeeDto;
import dto.PatientDto;
import dto.VisitDto;
import service.ClinicService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    /*Клиника: создайте систему для назначения посещений врачей и управления
    свободным временем посещений. Для пациентов должны вестись
    регистрационные карточки.*/
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в клинику");
        Clinic clinic = createClinic();
        new ClinicService(clinic);
        String input;
        do{
            System.out.println("Выберите раздел:" +
                    "\n 1. Список пациентов" +
                    "\n 2. Список отделений клиники" +
                    "\n 3. Записаться на прием" +
                    "\n 4. Показать отчет" +
                    "\n 5. Выход");
            input = in.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Пациенты клиники");
                    clinic.getPatients().
                            forEach(x -> System.out.println("" + x.toString()));
                    break;
                case "2":
                    System.out.println("Список отделений клиники");
                    clinic.getDepartments().
                            forEach(x -> System.out.println("--" + x.getName()));
                    break;
                case "3":
                    System.out.println("Запись на прием");
                    createVisit(clinic);
                    break;
                case "4":
                    System.out.println("Отчет по клинике");
                    clinic.getDepartments().forEach(x -> x.getVisits().forEach(y -> System.out.println(y.toString())));
                    break;
                case "5":
                    System.out.println("Выход из программы...");
                    break;


            }
        }while(!"9".equals(input));
    }


    public static void createVisit(Clinic clinic) {
        System.out.println("Выберите отделение:");
        printDepartments(clinic);
        int depIndex = in.nextInt();
        System.out.println("Выберите врача:");
        printEmployees(clinic.getDepartments().get(depIndex));
        int empIndex = in.nextInt();
        System.out.println("Выберите пациента:");
        printPatients(clinic.getPatients());
        int patIndex = in.nextInt();
        System.out.println("Введите желаемую дату и время посещения:");
        in.nextLine();
        String dateVisit = in.nextLine();


        DepartmentDto dep = clinic.getDepartments().get(depIndex);
        EmployeeDto employee = dep.getEmployees().get(empIndex);
        PatientDto patient = clinic.getPatients().get(patIndex);
        try {
            clinic.addVisit(dep, patient, employee, dateVisit);
        } catch (Exception e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }


    public static void printDepartments(Clinic clinic) {
        int i = 0;
        for (var department : clinic.getDepartments()) {
            System.out.println("[" + i + "]" + department.getName());
            i++;
        }
    }

    public static void printEmployees(DepartmentDto department) {
        int i = 0;
        for (var emp : department.getEmployees()) {
            System.out.println("[" + i + "]" + emp.toString());
            i++;
        }
    }

    public static void printPatients(List<PatientDto> patients) {
        int i = 0;
        for (var pat : patients) {
            System.out.println("[" + i + "]" + pat.toString());
            i++;
        }
    }


    private static Clinic createClinic() {
        System.out.println("Запуск Клиники");
        List<PatientDto> patients = new ArrayList<>();
        patients.add(new PatientDto("Андрей", "Семенов", "11.01.1995"));
        patients.add(new PatientDto("Евгений", "Парыгин", "15.04.1992"));
        patients.add(new PatientDto("Алексей", "Ершов", "10.03.1978"));
        patients.add(new PatientDto("Михаил", "Достоевский", "16.02.1987"));

        List<DepartmentDto> departments = new ArrayList<>();

        DepartmentDto dep1 = new DepartmentDto("Хирургия");
        DepartmentDto dep2 = new DepartmentDto("Терапия");

        EmployeeDto emp1 = new EmployeeDto("Александр", "Овечкин");
        EmployeeDto emp2 = new EmployeeDto("Аркадий", "Агафонов");
        List<EmployeeDto> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        dep1.setEmployees(employees);
        dep2.setEmployees(employees);

        departments.add(dep1);
        departments.add(dep2);

        Clinic clinic = new Clinic(patients, departments);

        System.out.println("Клиника запущена!");

        return clinic;
    }
}
