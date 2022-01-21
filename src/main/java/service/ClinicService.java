package service;

import domain.Clinic;
import dto.DepartmentDto;
import dto.EmployeeDto;
import dto.PatientDto;
import dto.VisitDto;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ClinicService {
    private final Clinic clinic;
    //public EntityManager em = Persistence.createEntityManagerFactory("clinic").createEntityManager();

    public ClinicService(Clinic clinic) {
        this.clinic = clinic;
        System.out.println("Добро пожаловать в Клинику");
    }
/*    public VisitDto add(VisitDto visitDto){
        em.getTransaction().begin();
        VisitDto visitFromDB = em.merge(visitDto);
        em.getTransaction().commit();
        return visitFromDB;
    }*/
}
