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
public class SecretaryRequestDeleteAccount_GUI extends javax.swing.JFrame {

    /**
     * Creates new form DeleteAccount_GUI
     */
    public SecretaryRequestDeleteAccount_GUI() {
        initComponents();
        
        ArrayList<Users> rePatients = new ArrayList<Users>();
        getData data = new getData();
        try{
        data.readDeletePatients(rePatients);
        }
        catch(Exception e){
        e.printStackTrace();
        }
        
        Object[] aPatients = rePatients.toArray();
        int length = aPatients.length;
        String userName = ((User.Users)aPatients[0]).getUserId();
        txtUsername.setText(userName);
        String password = ((User.Users)aPatients[0]).getPassword();
        txtPassword.setText(password);
        String firstName = ((User.Patient)aPatients[0]).getFirst_Name();
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
        jLabel1.setText("Secretary Request Delete Account");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(txtUsername))))
                        .addGap(20, 121, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(50, 189, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Secretary_GUI open = new Secretary_GUI();
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
           data.removePatient(patients.get(k), patients );
           

           txtUsername.setText("");
           txtPassword.setText("");
           
           if(length != 1){
           length = length -1;
           }
           for (int l = 0; l < length; l++){
           
           
        aPatients = patients.toArray();
        String userId = ((User.Patient)aPatients[l]).getUserId();
        String aPassword = ((User.Patient)aPatients[l]).getPassword();
        String first_Name = ((User.Patient)aPatients[l]).getFirst_Name();
        String last_Name = ((User.Patient)aPatients[l]).getLast_Name();
        String mobilePhoneNumber = ((User.Patient)aPatients[l]).getPhone_Number();        
        String addressLine = ((User.Patient)aPatients[l]).getAddress();        
        String postcode = ((User.Patient)aPatients[l]).getPostcode();
        String dateOfBirth = ((User.Patient)aPatients[l]).getDate_Of_Birth();
        String gender = ((User.Patient)aPatients[l]).getSex();
        String NHSNumber = ((User.Patient)aPatients[l]).getNhs_Number();
        try{
           BufferedWriter clear = new BufferedWriter(new FileWriter("./accounts\\Patient.txt", false));
           clear.newLine();
           }
           catch(Exception e){
           e.printStackTrace();
           }
           if(length != 1){
           length = length -1;
           }
           
           
         try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./accounts\\Patient.txt", true));
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
         
           }
        try{
        data.readDeletePatients(patients);
        }
        catch(Exception e) {
        e.printStackTrace();
        }
        
        aPatients = patients.toArray();
        length = aPatients.length;
        
        
        try{
           BufferedWriter clear = new BufferedWriter(new FileWriter("./accounts\\PatientDelete.txt", false));
           clear.newLine();
           }
           catch(Exception e){
           e.printStackTrace();
           }
           if(length != 1){
           length = length -1;
           }
           
           data.removePatient(patients.get(1), patients );
           
           for (int l = 0; l < length; l++){
                aPatients = patients.toArray();
        String userId = ((User.Patient)aPatients[l]).getUserId();
        String aPassword = ((User.Patient)aPatients[l]).getPassword();
        String first_Name = ((User.Patient)aPatients[l]).getFirst_Name();
        String last_Name = ((User.Patient)aPatients[l]).getLast_Name();
        String mobilePhoneNumber = ((User.Patient)aPatients[l]).getPhone_Number();        
        String addressLine = ((User.Patient)aPatients[l]).getAddress();        
        String postcode = ((User.Patient)aPatients[l]).getPostcode();
        String dateOfBirth = ((User.Patient)aPatients[l]).getDate_Of_Birth();
        String gender = ((User.Patient)aPatients[l]).getSex();
        String NHSNumber = ((User.Patient)aPatients[l]).getNhs_Number();
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
        
        
        
  
        
        }
        }
        
        k++;
            
        }
        
    

        
               
        
        
        
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

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
            java.util.logging.Logger.getLogger(SecretaryRequestDeleteAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryRequestDeleteAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryRequestDeleteAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryRequestDeleteAccount_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryRequestDeleteAccount_GUI().setVisible(true);
            }
        });
    }

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