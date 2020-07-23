/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;

import User.Users;
import User.getData;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


/**
 *
 * @author Josh
 */
public class AdminRemoveDoctorSecretary_GUI extends javax.swing.JFrame {

    /**
     * Creates new form RemoveDoctorSecretary_GUI
     */
    public AdminRemoveDoctorSecretary_GUI() {
        initComponents();
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
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        cmbUser_Type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Remove Doctor and Secretary ");

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

        jLabel2.setText("Click Submit to Delete");

        jLabel3.setText("User ID");

        cmbUser_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Secretary" }));

        jLabel4.setText("Enter User ID of Doctor/Secretary you want to delete");

        jLabel5.setText("Select from list: Doctor or Secretary to Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(cmbUser_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                                    .addComponent(txtUserId)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbUser_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Administrator_GUI open = new Administrator_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
            
            String userType = cmbUser_Type.getSelectedItem().toString();
            switch(userType) {
                case "Doctor" :
                    //when the user selects doctor from the drop down list, it does case doctor 
                    //and if they click scretary in the drop down box it does the secreatary part of the code
                    
                    ArrayList<Users> doctors = new ArrayList<Users>();
        getData data = new getData();
                //Reads the data from the Doctors text file
        try{
        data.readDoctors(doctors);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        Object[] aDoctors = doctors.toArray();
        int length = aDoctors.length;
        String[] username = new String[length];
        for (int i = 0; i < length; i++) {
        String name = ((User.Doctor)aDoctors[i]).getUserId();
        
        username[i] = name;
              
        }
        int k = 0;
        boolean userTrue;
        while(k < length) {
        if(username[k].equals(txtUserId.getText())){
            userTrue = true;        
        }
        else{
                userTrue = false;
            }
        
            //If the Doctors name matches the doctors name in the text file then a boolean will be set to true
        if(Boolean.TRUE.equals(userTrue)){
        data.removeDoctor(doctors.get(k), doctors);
            //Removes the selected doctor from the array list
        aDoctors = doctors.toArray();
        try{
        BufferedWriter clear = new BufferedWriter (new FileWriter("./accounts\\Doctor.txt",false));
        clear.newLine();
        clear.close();
        }        
            //Clears the text file
        catch(Exception e) {
        e.printStackTrace();
        }
        if(length != 1){
        length = length - 1;
        }
            //Changes the length variable to match the lenth of the array
        
                
        for (int i = 0; i < length; i++) {
        
            
            
        String userId = ((User.Doctor)aDoctors[k]).getUserId();
        String aPassword = ((User.Doctor)aDoctors[k]).getPassword();
        String first_Name = ((User.Doctor)aDoctors[k]).getFirst_Name();
        String last_Name = ((User.Doctor)aDoctors[k]).getLast_Name();
        int ratingsLength = ((User.Doctor)aDoctors[k]).getRatingsLength();
            //Gets all of the doctors details from objects.
                        
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\Doctor.txt", true));
        out.newLine();
        out.write(userId);
        out.newLine();
        out.write(aPassword);
        out.newLine();
        out.write(first_Name);
        out.newLine();
        out.write(last_Name);
        out.newLine();
        out.write(String.valueOf(ratingsLength));
        out.newLine();        
            //Prints all of the doctors details to the text file
        
        for (int p = 0; p < ratingsLength; p++) {
        int[] ratings = ((User.Doctor)aDoctors[p]).getRatings();
        out.write(String.valueOf(ratings[1]));
        out.newLine();
        }
        
        for (int p = 0; p < ratingsLength; p++) {
        String[] description = ((User.Doctor)aDoctors[p]).getDescription();        
        out.write(description[i]);
        out.newLine();
        }
        
        
        out.close();
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        }
        
        
        }
            k++;

        
        } 
        break;
        case "Secretary" :
        }
          //Repeat of the code above used for doctors but variables 
          //changed to match secreatarys instead of doctors  
            
            
            ArrayList<Users> secretarys = new ArrayList<Users>();
        getData data = new getData();
        
        try{
        data.readSecretary(secretarys);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        Object[] aSecretarys = secretarys.toArray();
        int length = aSecretarys.length;
        String[] username = new String[length];
        for (int i = 0; i < length; i++) {
        String name = ((User.Secretary)aSecretarys[i]).getUserId();
        
        username[i] = name;
              
        }
        int k = 0;
        boolean userTrue;
        while(k < length) {
        if(username[k].equals(txtUserId.getText())){
            userTrue = true;        
        }
        else{
                userTrue = false;
            }
        
        
        if(Boolean.TRUE.equals(userTrue)){
        data.removeDoctor(secretarys.get(k), secretarys);
        aSecretarys = secretarys.toArray();
        try{
        BufferedWriter clear = new BufferedWriter (new FileWriter("./accounts\\Secretary.txt",false));
        clear.newLine();
        clear.close();
        }        
        
        catch(Exception e) {
        e.printStackTrace();
        }
        if(length != 1){
        length = length - 1;
        }
        
                
        for (int i = 0; i < length; i++) {
        
        String userId = ((User.Secretary)aSecretarys[k]).getUserId();
        String aPassword = ((User.Secretary)aSecretarys[k]).getPassword();
        
        
                        
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\Secretary.txt", true));
        out.newLine();
        out.write(userId);
        out.newLine();
        out.write(aPassword);
        out.newLine();      
                
        
        
        out.close();
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        }
        
        
        }
            k++;

        
        }
            
        
      
        
    }//GEN-LAST:event_btnSubmitActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbUser_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
