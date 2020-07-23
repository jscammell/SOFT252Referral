/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;

import User.Users;
import User.getData;
import User.Doctor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;


/**
 *
 * @author Josh
 */
public class PatientDoctorRating_GUI extends javax.swing.JFrame {

    /**
     * Creates new form DoctorRating_GUI
     */
    public PatientDoctorRating_GUI() {
        initComponents();
        getData Data = new getData();
        ArrayList<Users> doctors = new ArrayList<Users>();
        try{
        Data.readDoctors(doctors);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        Object[] aDoctors = doctors.toArray();
        int length;
        length = aDoctors.length;
        String[] doctor_Name = new String[length+1];
        doctor_Name[0] = "Select";
        java.util.List<String> list = new java.util.ArrayList<String>();
        for (int i=0; i < length; i++) {
        String name = ((User.Doctor)aDoctors[i]).getFirst_Name();
        doctor_Name[i+1] = name;
        }
        final DefaultComboBoxModel model = new DefaultComboBoxModel (doctor_Name);
        final  DefaultComboBoxModel modela = new DefaultComboBoxModel (doctor_Name);
        JPanel panel = new JPanel();

        cmbViewDoctor.setModel(model);
        cmbRateDoctor.setModel(model);
        
        
        cmbViewDoctor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                String cmbDoctors_Name = cmbViewDoctor.getSelectedItem().toString();
        
                try{
                    boolean docTrue = false;
                    for (int i = 0; i < length; i++) {
                        int ratingLength = ((User.Doctor)aDoctors[i]).getRatingsLength();
                        int[] rating = new int[ratingLength];
                        rating = ((User.Doctor)aDoctors[i]).getRatings();
        
                        while(cmbDoctors_Name.equals(((User.Doctor)aDoctors[i]).getFirst_Name())){
                            int meanRating = 0;
                            for (int k = 0; k < ratingLength; k++) {
                                int ratings = rating[k];
                                meanRating = meanRating + ratings;        
                            }
                            meanRating = meanRating / ratingLength;
                            docTrue = true;
                            txtViewRating.setText(String.valueOf(meanRating));
                            break;
                        }
                        if(Boolean.TRUE.equals(docTrue)){
                            break;
                        }
                
                    }
                }
                catch(Exception e) {
                e.printStackTrace();
                }
            }
        });
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
        cmbRateDoctor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtRateDoctor = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbViewDoctor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtViewRating = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Doctor Rating");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Rate Doctor");

        cmbRateDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Please Choose A Doctor To Rate");

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

        jLabel4.setText("Rating /10");

        jLabel5.setText("Description For Given Rating");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("View Doctor Rating");

        cmbViewDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Please Choose A Doctor To View Rating");

        jLabel8.setText("Average Doctor Rating");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 133, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtViewRating)
                            .addComponent(txtDescription)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cmbRateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtRateDoctor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addComponent(txtViewRating, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Patient_GUI open = new Patient_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        getData Data = new getData();
        ArrayList<Users> doctors = new ArrayList<Users>();
        try{
            Data.readDoctors(doctors);       
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Object[] aDoctor = doctors.toArray();
        int length;
        length = aDoctor.length;
       
        String description;
        int rating;
        boolean isNotEmpty = false;
       
        if(txtRateDoctor != null){
            rating = Integer.parseInt(txtRateDoctor.getText());
            isNotEmpty = true;
        }
        else{
            isNotEmpty = false;
        rating = 0;
        }
        if(txtDescription != null){
            description = txtDescription.getText();
            isNotEmpty = true;
        }
        else{
            description = null;
            isNotEmpty = false;
            rating = 0;
        }
        String cmbDoctorName = cmbRateDoctor.getSelectedItem().toString();
        if(Boolean.TRUE.equals(isNotEmpty)){
       
            for (int i = 0; i < length; i++) {
            int ratingLength = ((User.Doctor)aDoctor[i]).getRatingsLength();
            while(cmbDoctorName.equals(((User.Doctor)aDoctor[i]).getFirst_Name())){
                int[] ratings = ((User.Doctor)aDoctor[i]).getRatings();
                int[] newRatings = new int[ratingLength + 1];
                String[] descriptions = ((User.Doctor)aDoctor[i]).getDescription();
                String[] newDescriptions = new String[ratingLength + 1];
                for (int k = 0; k < ratingLength; k++) {
                    newRatings[k] = ratings[k];
                }
                newRatings[ratingLength] = rating;
                ((User.Doctor)aDoctor[i]).setRatings(newRatings);
           
                for (int j = 0; j < ratingLength; j++) {
                    newDescriptions[j] = descriptions[j];
                }
                newDescriptions[ratingLength] = description;
                ((User.Doctor)aDoctor[i]).setDescription(newDescriptions);
                newRatings[ratingLength] = rating;
                ratingLength = ratingLength + 1;
                ((User.Doctor)aDoctor[i]).setRatingsLength(ratingLength);
                break;           
                }
            }
            try{
                BufferedWriter clear = new BufferedWriter(new FileWriter("./accounts\\Doctor.txt",false));
                clear.newLine();
            }
            catch(Exception e){
                e.printStackTrace();
            }
           
            for (int l = 0; l < length; l++) {
                aDoctor = doctors.toArray();
                String userId = ((User.Doctor)aDoctor[l]).getUserId();
                String aPassword = ((User.Doctor)aDoctor[l]).getPassword();
                String first_Name = ((User.Doctor)aDoctor[l]).getFirst_Name();
                String last_Name = ((User.Doctor)aDoctor[l]).getLast_Name();
                int ratingLength = ((User.Doctor)aDoctor[l]).getRatingsLength();
           
           
                try{
                    BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\Doctor.txt",true));
                    out.newLine();
                    out.write(userId);
                    out.newLine();
                    out.write(aPassword);
                    out.newLine();
                    out.write(first_Name);
                    out.newLine();
                    out.write(last_Name);
                    out.newLine();
                    out.write(String.valueOf(ratingLength));
                    out.newLine();
           
                    for (int i = 0; i < ratingLength; i++) {
                        int[] ratings = ((User.Doctor)aDoctor[l]).getRatings();
                        out.write(String.valueOf(ratings[i]));
                        out.newLine();
                    }
                    
                    for (int i = 0; i < ratingLength; i++) {
                        String[] descriptions = ((User.Doctor)aDoctor[l]).getDescription();
                        out.write(descriptions[i]);
                        out.newLine();
                    }
                    
           
                    out.close();
                }    
                catch(Exception e) {
                    e.printStackTrace();
                }           
           
            }
           
           
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbRateDoctor;
    private javax.swing.JComboBox<String> cmbViewDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtRateDoctor;
    private javax.swing.JTextField txtViewRating;
    // End of variables declaration//GEN-END:variables
}