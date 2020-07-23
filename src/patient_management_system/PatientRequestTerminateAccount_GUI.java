/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import User.Users;
import User.getData;


/**
 *
 * @author Josh
 */
public class PatientRequestTerminateAccount_GUI extends javax.swing.JFrame {

    /**
     * Creates new form DeleteAccount_GUI
     */
    public PatientRequestTerminateAccount_GUI() {
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
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Delete Account");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Username And Password Of The Account You Want To Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteAccount)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(txtUsername)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAccount)
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

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
    
        ArrayList<Users> patients = new ArrayList<Users>();
        getData data = new getData();
        
        try{
        data.readPatients(patients);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        Object[] aPatients = patients.toArray();
        int length = aPatients.length;
        String[] username = new String[length], password = new String[length];
        for (int i = 0; i < length; i++) {
        String name = ((User.Patient)aPatients[i]).getUserId();
        String pass = ((User.Patient)aPatients[i]).getPassword();
        username[i] = name;
        password[i] = pass;        
        }
        int k = 0;
        boolean userTrue;
        boolean passTrue;
        while(k < length) {
        if(username[k].equals(txtUsername.getText())){
            userTrue = true;        
        }
        else{
                userTrue = false;
            }
        if(password[k].equals(txtPassword.getText())){
        passTrue = true;
        }
        else{
        passTrue = false;
        }
        if(Boolean.TRUE.equals(passTrue) && Boolean.TRUE.equals(userTrue)){
        aPatients = patients.toArray();
        String userId = ((User.Patient)aPatients[k]).getUserId();
        String aPassword = ((User.Patient)aPatients[k]).getPassword();
        String first_Name = ((User.Patient)aPatients[k]).getFirst_Name();
        String last_Name = ((User.Patient)aPatients[k]).getLast_Name();
        String mobilePhoneNumber = ((User.Patient)aPatients[k]).getPhone_Number();        
        String addressLine = ((User.Patient)aPatients[k]).getAddress();        
        String postcode = ((User.Patient)aPatients[k]).getPostcode();
        String dateOfBirth = ((User.Patient)aPatients[k]).getDate_Of_Birth();
        String gender = ((User.Patient)aPatients[k]).getSex();
        String NHSNumber = ((User.Patient)aPatients[k]).getNhs_Number();
        
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\PatientDelete.txt", true));
        out.newLine();
        out.write(userId);
        out.newLine();
        out.write(aPassword);
        out.newLine();
        out.write(first_Name);
        out.newLine();
        out.write(last_Name);
        out.newLine();
        out.write(mobilePhoneNumber);
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
        

            k++;
        }
        
        }
        
               
        
        
        
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
