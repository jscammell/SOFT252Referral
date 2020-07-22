/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processes;

/**
 *
 * @author Josh
 */
public class History {    
    private String appointment_Day;
    private String appointment_Month;
    private String appointment_Year;
    private String patient_Name;
    private String doctor_Name;
    private String doctors_Note;

    public History(String appointment_Day, String appointment_Month, String appointment_Year, String patient_Name, String doctor_Name, String doctors_Note) {
        this.appointment_Day = appointment_Day;
        this.appointment_Month = appointment_Month;
        this.appointment_Year = appointment_Year;
        this.patient_Name = patient_Name;
        this.doctor_Name = doctor_Name;
        this.doctors_Note = doctors_Note;
    }

    public String getAppointment_Day() {
        return appointment_Day;
    }

    public void setAppointment_Day(String appointment_Day) {
        this.appointment_Day = appointment_Day;
    }

    public String getAppointment_Month() {
        return appointment_Month;
    }

    public void setAppointment_Month(String appointment_Month) {
        this.appointment_Month = appointment_Month;
    }

    public String getAppointment_Year() {
        return appointment_Year;
    }

    public void setAppointment_Year(String appointment_Year) {
        this.appointment_Year = appointment_Year;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public String getDoctors_Note() {
        return doctors_Note;
    }

    public void setDoctors_Note(String doctors_Note) {
        this.doctors_Note = doctors_Note;
    }
    
    
    
    
    
}
