/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import User.getData;
import User.Users;
import java.util.ArrayList;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
 

/**
 *
 * @author Josh
 */
public class ApprovePatientAccount_GUI extends javax.swing.JFrame {

    /**
     * Creates new form RequestAccount_GUI
     */
    public ApprovePatientAccount_GUI() {
        initComponents();
        
        ArrayList<Users> rePatients = new ArrayList<Users>();
        getData data = new getData();
        try{
        data.readRePatients(rePatients);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        Object[] aPatients = rePatients.toArray();
        int length = aPatients.length;
        String username = ((User.Patient)aPatients[0]).getUserId();
        txtUsername.setText(username);
        String password = ((User.Patient)aPatients[0]).getPassword();
        txtPassword.setText(password);
        String First_Name = ((User.Patient)aPatients[0]).getFirst_Name();
        txtFirstName.setText(First_Name);
        String last_Name = ((User.Patient)aPatients[0]).getLast_Name();
        txtLastName.setText(last_Name);
        String mobilePhoneNumber = ((User.Patient)aPatients[0]).getPhone_Number();
        txtMobilePhoneNumber.setText(mobilePhoneNumber);        
        String addressLine = ((User.Patient)aPatients[0]).getAddress();
        txtAddressLine.setText(addressLine);        
        String postcode = ((User.Patient)aPatients[0]).getPostcode();
        txtPostcode.setText(postcode);
        String dateOfBirth = ((User.Patient)aPatients[0]).getDate_Of_Birth();
        txtDateOfBirth.setText(dateOfBirth);
        String gender = ((User.Patient)aPatients[0]).getSex();
        txtGender.setText(gender);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        txtGender1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtMobilePhoneNumber = new javax.swing.JTextField();
        txtAddressLine = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtNHSNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Approve Patient Account");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jLabel6.setText("Mobile Phone Number");

        jLabel8.setText("Address Line");

        jLabel10.setText("Postcode");

        jLabel11.setText("Date Of Birth");

        jLabel12.setText("Gender");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        txtLastName.setToolTipText("");

        jLabel13.setText("NHS Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNHSNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLastName)
                            .addComponent(txtMobilePhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddressLine, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPostcode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDateOfBirth)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMobilePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddressLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNHSNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequest))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Secretary_GUI open = new Secretary_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        boolean isNotEmpty = false;
        String fileUsername;
        String filePassword;
        String firstName;
        String lastName;
        String mobileNumber;        
        String addressLine;        
        String postcode;
        String dateOfBirth;
        String gender;
        String NHSNumber;
        
        if(txtUsername != null) {
        fileUsername = txtUsername.getText();
        isNotEmpty = true;
        txtUsername.setText("");
        }
        else{
        fileUsername = null;
        isNotEmpty = false;
        }   //checks if the text fields are empty or not. If they are empty it sets isNotEmpty to true.
        
        
        if(txtPassword != null) {
        filePassword = txtPassword.getText();
        isNotEmpty = true;
        txtPassword.setText("");
        }
        else{
        filePassword = null;
        isNotEmpty = false;
        }
        
        
        if(txtFirstName != null) {
        firstName = txtFirstName.getText();
        isNotEmpty = true;
        txtFirstName.setText("");
        }
        else{
        firstName = null;
        isNotEmpty = false;
        }
        
        
        if(txtLastName != null) {
        lastName = txtLastName.getText();
        isNotEmpty = true;
        txtLastName.setText("");
        }
        else{
        lastName = null;
        isNotEmpty = false;
        }
        
        
        if(txtMobilePhoneNumber != null) {
        mobileNumber = txtMobilePhoneNumber.getText();
        isNotEmpty = true;
        txtMobilePhoneNumber.setText("");
        }
        else{
        mobileNumber = null;
        isNotEmpty = false;
        }               
        
        
        
        if(txtAddressLine != null) {
        addressLine = txtAddressLine.getText();
        isNotEmpty = true;
        txtAddressLine.setText("");
        }
        else{
        addressLine = null;
        isNotEmpty = false;
        }               
        
        
        
        if(txtPostcode != null) {
        postcode = txtPostcode.getText();
        isNotEmpty = true;
        txtPostcode.setText("");
        }
        else{
        postcode = null;
        isNotEmpty = false;
        }
        
        
        if(txtDateOfBirth != null) {
        dateOfBirth = txtDateOfBirth.getText();
        isNotEmpty = true;
        txtDateOfBirth.setText("");
        }
        else{
        dateOfBirth = null;
        isNotEmpty = false;
        }
        
        
        if(txtGender != null) {
        gender = txtGender.getText();
        isNotEmpty = true;
        txtGender.setText("");
        }
        else{
        gender = null;
        isNotEmpty = false;
        }
        if(txtNHSNumber != null) {
        NHSNumber = txtNHSNumber.getText();
        isNotEmpty = true;
        txtNHSNumber.setText("");
        }
        else{
        NHSNumber = null;
        isNotEmpty = false;
        }
        
        
        if (Boolean.TRUE.equals(isNotEmpty)){
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\Patient.txt",true));
        out.newLine();
        out.write(fileUsername);
        out.newLine();
        out.write(filePassword);
        out.newLine();
        out.write(firstName);
        out.newLine();
        out.write(lastName);
        out.newLine();
        out.write(mobileNumber);
        out.newLine();        
        out.write(addressLine);
        out.newLine();        
        out.write(postcode);
        out.newLine();
        out.write(dateOfBirth);
        out.newLine();
        out.write(gender);
        out.newLine();
        out.write(NHSNumber);
        out.newLine();
        
        out.close();
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        ArrayList<Users> rePatients = new ArrayList<Users>();
        getData data = new getData();
        try{
        data.readRePatients(rePatients);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        Object[] aPatients = rePatients.toArray();
        
        int length = aPatients.length;
        data.removePatient (rePatients.get(0),rePatients);
        aPatients = rePatients.toArray();
        aPatients = rePatients.toArray();
        int newLength = aPatients.length;
        if(newLength > 0) {
        
            for (int l = 0; l < newLength; l++) {
        
                fileUsername = ((User.Patient)aPatients[l]).getUserId();
                filePassword = ((User.Patient)aPatients[l]).getPassword();
                firstName = ((User.Patient)aPatients[l]).getFirst_Name();
                lastName = ((User.Patient)aPatients[l]).getLast_Name();
                mobileNumber = ((User.Patient)aPatients[l]).getPhone_Number();
                addressLine = ((User.Patient)aPatients[l]).getAddress();
                postcode = ((User.Patient)aPatients[l]).getPostcode();
                dateOfBirth = ((User.Patient)aPatients[l]).getDate_Of_Birth();
                gender = ((User.Patient)aPatients[l]).getSex();
                NHSNumber = ((User.Patient)aPatients[l]).getUserId();
                
                try{
                BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\PatientRequest.txt", false));
                out.newLine();
                out.write(fileUsername);
                out.newLine();
                out.write(filePassword);
                out.newLine();
                out.write(firstName);
                out.newLine();
                out.write(lastName);
                out.newLine();
                out.write(mobileNumber);
                out.newLine();                
                out.write(addressLine);
                out.newLine();                
                out.write(postcode);
                out.newLine();
                out.write(dateOfBirth);
                out.newLine();
                out.write(gender);
                out.newLine();
                out.write(NHSNumber);
                out.newLine();
                
                }
                 catch(Exception e) {
                    e.printStackTrace();
                }
                
        }
            
        }
        else{
         try{
                BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\PatientRequest.txt", false));
                    out.newLine();
                }
                catch(Exception e){
                    e.printStackTrace();
                }   
        }        
        }
        
    }//GEN-LAST:event_btnRequestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApprovePatientAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApprovePatientAccount_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtAddressLine;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobilePhoneNumber;
    private javax.swing.JTextField txtNHSNumber;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
