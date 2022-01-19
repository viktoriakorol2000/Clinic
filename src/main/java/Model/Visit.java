package Model;

import java.util.Date;

public class Visit {
    private PatientCard patient;
    private Date date;

    public Visit(PatientCard patient, Date date) {
        this.patient = patient;
        this.date = date;
    }

    public PatientCard getPatient() {
        return patient;
    }

    public Date getDate() {
        return date;
    }

    public void setPatient(PatientCard patient) {
        this.patient = patient;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Посещение: {" +
                "Пациент -" + patient +
                ", Дата -" + date +
                '}';
    }
}
