/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import Processes.Medication;
import Processes.Appointment;
import Processes.Prescription;
import Processes.History;


/**
 *
 * @author Josh
 */
public class getData {
    
    private ArrayList<Users>patients;
    private ArrayList <Users>administrators;
    private ArrayList<Users>secretarys;
    private ArrayList<Users>doctors;
    
    public void readPatients(ArrayList<Users>patients)throws Exception
    {
        File file = new File("./accounts\\Patient.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
            String userId;
            String password;
            String first_Name;
            String last_Name;
            String phone_Number;
            String address;
            String postcode;
            String date_Of_Birth;
            int age;
            String sex;
            String nhs_Number;
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            last_Name = br.readLine();
            phone_Number = br.readLine();
            address = br.readLine();
            postcode = br.readLine();
            date_Of_Birth = br.readLine();            
            sex = br.readLine();
            nhs_Number = br.readLine();
            
            Users newpatient = new Patient(userId, password, first_Name, last_Name, phone_Number, address, postcode, date_Of_Birth, sex, nhs_Number); 
            
            addPatient(newpatient, patients);
            
            
        } 
    }
    
    
    public void readRePatients(ArrayList<Users>patients)throws Exception
    {
        File file = new File("./accounts\\PatientRequest.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
            String userId;
            String password;
            String first_Name;
            String last_Name;
            String phone_Number;
            String address;
            String postcode;
            String date_Of_Birth;
            int age;
            String sex;
            String nhs_Number;
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            last_Name = br.readLine();
            phone_Number = br.readLine();
            address = br.readLine();
            postcode = br.readLine();
            date_Of_Birth = br.readLine();            
            sex = br.readLine();
            
            Users newpatient = new Patient(userId, password, first_Name, last_Name, phone_Number, address, postcode, date_Of_Birth, sex); 
            
            addPatient(newpatient, patients);
            
            
        } 
    }
    
    
    public void readDeletePatients(ArrayList<Users>patients)throws Exception
    {
        File file = new File("./accounts\\PatientDelete.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
            String userId;
            String password;
            String first_Name;
            String last_Name;
            String phone_Number;
            String address;
            String postcode;
            String date_Of_Birth;
            int age;
            String sex;
            String nhs_Number;
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            last_Name = br.readLine();
            phone_Number = br.readLine();
            address = br.readLine();
            postcode = br.readLine();
            date_Of_Birth = br.readLine();            
            sex = br.readLine();
            nhs_Number = br.readLine();
            
            Users newpatient = new Patient(userId, password, first_Name, last_Name, phone_Number, address, postcode, date_Of_Birth, sex, nhs_Number); 
            
            addPatient(newpatient, patients);
            
            
        } 
    }
    
    
    
    public void addPatient(Users f, ArrayList patients)
    {
        //patients = new ArrayList<User>();
        patients.add(f);
        //return patients;
    }

    public void removePatient(Users f, ArrayList patients)
    {
        //patients = new ArrayList<User>();
        patients.remove(f);
        //return patients;
    }      
        
        
        
        
        
       
       public void readDoctors(ArrayList<Users>doctors)throws Exception
    {
        File file = new File("./accounts\\Doctor.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
        String userId;
        String password;
        String first_Name;
        String last_Name;
        int ratingsLength;        
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            last_Name = br.readLine(); 
            ratingsLength = Integer.parseInt(br.readLine());
            int[] ratings = new int[ratingsLength];
            String[] description = new String[ratingsLength];
            for (int i = 0; i < ratingsLength; i++) {
                ratings[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < ratingsLength; i++) {
                description[i] = br.readLine();
            }
            
            
            
            Users newdoctor = new Doctor(userId, password, first_Name, last_Name, ratingsLength, ratings, description); 
            
            adddoctor(newdoctor, doctors);
            
            //doctors = new ArrayList<Users>();
        } 
    }
       
       
       public void readDoctorFeedback(ArrayList<Users>doctors)throws Exception
    {
        File file = new File("./accounts\\DoctorFeedback.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
          
        String userId;        
        String first_Name;        
        int ratingsLength;        
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();            
            first_Name = br.readLine();            
            ratingsLength = Integer.parseInt(br.readLine());
            int[] ratings = new int[ratingsLength];
            String[] description = new String[ratingsLength];          
            
            for (int i = 0; i < ratingsLength; i++) {
                description[i] = br.readLine();
            }
            
            
            
            Users newdoctor = new Doctor(userId, first_Name, ratingsLength, description); 
            
            adddoctor(newdoctor, doctors);
            
            //doctors = new ArrayList<Users>();
        } 
    }
    
    public void adddoctor(Users doctor, ArrayList<Users> doctors)
        {
        doctors.add(doctor);
        }
       
        public void removeDoctor(Users doctor, ArrayList<Users> doctors)
        {
        doctors.remove(doctor);
        }
        
        
        
        
        
        
        public void readAdministrator(ArrayList<Users>Administrators)throws Exception
    {
        File file = new File("./accounts\\Administrator.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String userId;
        String password;
        String first_Name;
              
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();
            first_Name = br.readLine();
            
            
            
            Users newAdministrator = new Administrator(userId, password, first_Name); 
            
            addadministrator(newAdministrator, Administrators);
            
            //dministrators = new ArrayList<Users>();
        } 
    }
    
    public void addadministrator(Users administrator, ArrayList<Users> administrators)
        {
        administrators.add(administrator);
        }
       
        public void removeAdministrator(Users administrator,ArrayList<Users> administrators)
        {
        administrators.remove(administrator);
        }
        
        
        
        
        
        public void readSecretary(ArrayList<Users>Secretarys)throws Exception
    {
        File file = new File("./accounts\\Secretary.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String userId;
        String password;       
              
        
        
        while ((br.readLine())!=null) {
            userId = br.readLine();
            password = br.readLine();             
            
            
            Users newSecretary = new Secretary(userId, password); 
            
            addSecretary(newSecretary, Secretarys);
            
           // Secretarys = new ArrayList<Users>();
        } 
    }
    
    public void addSecretary(Users secretary, ArrayList<Users> secretarys)
        {
        secretarys.add(secretary);
        }
       
        public void removeSecretary(Users secretary, ArrayList<Users> secretarys)
        {
        secretarys.remove(secretary);
        }
        
        
public void readAppointment(ArrayList<Appointment>appointment)throws Exception
    {
        File file = new File("./accounts\\Appointment.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));                     
            
            String appointment_Day;
            String appointment_Month;
            String appointment_Year;
            String patient_Name;
            String doctor_Name;
            //String room_Number;
        
        while ((br.readLine())!=null) {
            appointment_Day = br.readLine();
            appointment_Month = br.readLine();
            appointment_Year = br.readLine();
            patient_Name = br.readLine();
            doctor_Name = br.readLine();
            
            
            
            Processes.Appointment Appoint = new Appointment(appointment_Day, appointment_Month, appointment_Year, patient_Name, doctor_Name); 
            
            addappointment(Appoint, appointment);
            
            
        } 
    }
    
    public void readAppointmentRequest(ArrayList<Appointment>appointment)throws Exception
    {
        File file = new File("./accounts\\AppointmentRequest.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));                     
            
            String appointment_Day;
            String appointment_Month;
            String appointment_Year;
            String patient_Name;
            String doctor_Name;            
        
        while ((br.readLine())!=null) {
            appointment_Day = br.readLine();
            appointment_Month = br.readLine();
            appointment_Year = br.readLine();
            patient_Name = br.readLine();
            doctor_Name = br.readLine();            
            
            
            Processes.Appointment Appoint = new Appointment(appointment_Day, appointment_Month, appointment_Year, patient_Name, doctor_Name); 
            
            addappointment(Appoint, appointment);
            
            
        } 
    }
    
    
    public void addappointment(Appointment f, ArrayList appointments)
    {
     
        appointments.add(f);
        
    }

    public void removeAppointment(Appointment f, ArrayList appointments)
    {
        
        appointments.remove(f);
        
    }

    
    
    
    
    public void readMedication(ArrayList<Medication>medications)throws Exception
    {
        File file = new File("./accounts\\Medication.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));                     
            
            String medicine_Name;
            String dosage;
            int quantity;
        
        while ((br.readLine())!=null) {
            medicine_Name = br.readLine();
            dosage = br.readLine();
            quantity = Integer.parseInt(br.readLine());           
            
            
            Processes.Medication Med = new Medication(medicine_Name, dosage, quantity); 
            
            addmedications(Med, medications);
            
            
        } 
    }
    
    
    public void readMedicationRequest(ArrayList<Medication>medications)throws Exception
    {
        File file = new File("./accounts\\RequestMedicine.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));                     
            
            String medicine_Name;
            String dosage;
            int quantity;
        
        while ((br.readLine())!=null) {
            medicine_Name = br.readLine();
            dosage = br.readLine();
            quantity = Integer.parseInt(br.readLine());           
            
            
            Processes.Medication Med = new Medication(medicine_Name, dosage, quantity); 
            
            addmedications(Med, medications);
            
            
        } 
    }
    
    
    
    public void addmedications(Medication f, ArrayList medications)
    {
        
        medications.add(f);
       
    }

    public void removeMedication(Medication f, ArrayList medications)
    {
      
        medications.remove(f);
       
    }
    
    
    
    public void readPrescription(ArrayList<Prescription>prescription)throws Exception
    {
        File file = new File("./accounts\\Prescription.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));                     
                       
            
            String doctor_Id;
            String patient_Id;
            String doctor_Notes;
            String medicine;
            int quantity;
            String dosage;
        
        while ((br.readLine())!=null) {
            doctor_Id = br.readLine();
            patient_Id = br.readLine();
            doctor_Notes = br.readLine();
            medicine = br.readLine();
            quantity = Integer.parseInt(br.readLine());
            dosage = br.readLine();
            
            
            Processes.Prescription Pres = new Prescription(doctor_Id, patient_Id, doctor_Notes, medicine, quantity, dosage); 
            
            addprescription(Pres, prescription);
            
            
        } 
    }
    
    
    
    public void addprescription(Prescription f, ArrayList prescriptions)
    {
       
        prescriptions.add(f);
       
    }

    public void removePrescription(Prescription f, ArrayList prescriptions)
    {
       
        prescriptions.remove(f);
        
    }
    
    
     public void readHistory(ArrayList<History>history)throws Exception
    {
        File file = new File("./accounts\\History.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));                     
            
            String appointment_Day;
            String appointment_Month;
            String appointment_Year;
            String patient_Name;
            String doctor_Name;
            String doctors_Note;
        
        while ((br.readLine())!=null) {
            appointment_Day = br.readLine();
            appointment_Month = br.readLine();
            appointment_Year = br.readLine();
            patient_Name = br.readLine();
            doctor_Name = br.readLine();
            doctors_Note = br.readLine();
            
            
            Processes.History Hist = new History(appointment_Day, appointment_Month, appointment_Year, patient_Name, doctor_Name, doctors_Note); 
            
            addHistory(Hist, history);
            
            
        } 
    }
     
     
      public void addHistory(History f, ArrayList historys)
    {
       
        historys.add(f);
       
    }

    public void removeHistory(History f, ArrayList historys)
    {
       
        historys.remove(f);
        
    }
    
}






