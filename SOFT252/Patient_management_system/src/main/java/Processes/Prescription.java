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
public class Prescription {
    private String doctor_Id;
    private String patient_Id;
    private String doctor_Notes;
    private String medicine;
    private int quantity;
    private String dosage;

    public Prescription(String doctor_Id, String patient_Id, String doctor_Notes, String medicine, int quantity, String dosage) {
        this.doctor_Id = doctor_Id;
        this.patient_Id = patient_Id;
        this.doctor_Notes = doctor_Notes;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    public String getDoctor_Id() {
        return doctor_Id;
    }

    public void setDoctor_Id(String doctor_Id) {
        this.doctor_Id = doctor_Id;
    }

    public String getPatient_Id() {
        return patient_Id;
    }

    public void setPatient_Id(String patient_Id) {
        this.patient_Id = patient_Id;
    }

    public String getDoctor_Notes() {
        return doctor_Notes;
    }

    public void setDoctor_Notes(String doctor_Notes) {
        this.doctor_Notes = doctor_Notes;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    
}
