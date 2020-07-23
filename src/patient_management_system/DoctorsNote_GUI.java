/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;
import Processes.Appointment;
import User.Users;
import User.getData;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
/**
 *
 * @author Josh
 */
public class DoctorsNote_GUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewAppointment_GUI
     */
    public DoctorsNote_GUI() {
        initComponents();
        getData Data = new getData();
        ArrayList<Users> doctors = new ArrayList<Users>();
        try{
        Data.readDoctors(doctors);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        Object[] arrayDoctors = doctors.toArray();
        int length;
        length = arrayDoctors.length;
        String[] doctor_Name = new String[length+1];
        doctor_Name[0] = "Select";
        java.util.List<String> list = new java.util.ArrayList<String>();
        for (int i=0; i < length; i++) {
        String name = ((User.Doctor)arrayDoctors[i]).getFirst_Name();
        doctor_Name[i+1] = name;
        }
        final DefaultComboBoxModel model = new DefaultComboBoxModel (doctor_Name);
        final  DefaultComboBoxModel modela = new DefaultComboBoxModel (doctor_Name);
        JPanel panel = new JPanel();

        cmbDoctor.setModel(model);
            //Reads from doctor text file and puts names into combobox
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDoctorNote = new javax.swing.JTextArea();
        btnSubmitHistory = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbDoctor = new javax.swing.JComboBox<>();
        txtDay = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Doctors Note");

        jLabel2.setText("Please Enter Username To Confrim");

        jLabel3.setText("Patient Name");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setText("Your Appointment");

        jLabel5.setText("Please Press Submit Button");

        jLabel6.setText("Write Notes");

        txtDoctorNote.setColumns(20);
        txtDoctorNote.setRows(5);
        jScrollPane2.setViewportView(txtDoctorNote);

        btnSubmitHistory.setText("Submit to History");
        btnSubmitHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitHistoryActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirm Doctor");

        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
            }
        });

        jLabel8.setText("DD");

        jLabel9.setText("MM");

        jLabel10.setText("YYYY");

        jLabel11.setText("Please Enter The Date You Want To Request An Appointment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel8)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel9)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubmitHistory)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitHistory)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Doctor_GUI open = new Doctor_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        ArrayList<Appointment> Appointment = new ArrayList<Appointment>();
        getData data = new getData();
        try{
        data.readAppointment(Appointment);
        }
        catch(Exception e){
        e.printStackTrace();
        }
        Object[] arrayAppointment = Appointment.toArray();
        int length = arrayAppointment.length;
        
        String[] username = new String[length];
        for (int i = 0; i < length; i++) {
        String name = ((Processes.Appointment)arrayAppointment[i]).getPatient_Name();
        username[i] = name;
            //reads from appointments text file
        }
        
        Boolean userTrue;
        String input;
        if(txtUsername.getText() != null) {
        userTrue = true;
        input = txtUsername.getText();
        }
        else{
        userTrue = false;
        input = null;
        }
            //Gets username
            
        if(Boolean.TRUE.equals(userTrue)){
        for (int i = 0; i < length; i++) {
        while(username[i].equals(input)){
        String day = ((Processes.Appointment)arrayAppointment[0]).getAppointment_Day();
        txtDay.setText(day);
        
        String month = ((Processes.Appointment)arrayAppointment[0]).getAppointment_Month();
        txtMonth.setText(month);
        
        String year = ((Processes.Appointment)arrayAppointment[0]).getAppointment_Year();
        txtYear.setText(year);      
        
                
        
        break;
            //sets text boxes to data relating to username
                
        }
        }
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitHistoryActionPerformed
        
        boolean isNotEmpty = false;
        String appointment_Day;
        String appointment_Month;
        String appointment_Year;
        String patient_Name;
        String note;
        
        if(txtDay != null) {
        appointment_Day = txtDay.getText();
        isNotEmpty = true;
        txtDay.setText("");
        }
        else{
        appointment_Day = null;
        isNotEmpty = false;
        }
        
        if(txtMonth != null) {
        appointment_Month = txtMonth.getText();
        isNotEmpty = true;
        txtMonth.setText("");
        }
        else{
        appointment_Month = null;
        isNotEmpty = false;
        }
        
        if(txtYear != null) {
        appointment_Year = txtYear.getText();
        isNotEmpty = true;
        txtYear.setText("");
        }
        else{
        appointment_Year = null;
        isNotEmpty = false;
        }
                
        
        if(txtUsername != null) {
        patient_Name = txtUsername.getText();
        isNotEmpty = true;
        txtUsername.setText("");
        }
        else{
        patient_Name = null;
        isNotEmpty = false;
        }     
        
        
        if(txtDoctorNote != null) {
        note = txtDoctorNote.getText();
        isNotEmpty = true;
        txtDoctorNote.setText("");
        }
        else{
        note = null;
        isNotEmpty = false;
        }     
      
              
        String doctor = cmbDoctor.getSelectedItem().toString();
        if (Boolean.TRUE.equals(isNotEmpty)){
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\History.txt",true));
        out.newLine();
        out.write(appointment_Day);
        out.newLine();
        out.write(appointment_Month);
        out.newLine();
        out.write(appointment_Year);
        out.newLine();
        out.write(patient_Name);
        out.newLine();
        out.write(doctor);
        out.newLine();
        out.write(note);
        out.newLine();
        
        
        out.close();
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        }
        
        
        
    }//GEN-LAST:event_btnSubmitHistoryActionPerformed

    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoctorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmitHistory;
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextArea txtDoctorNote;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
