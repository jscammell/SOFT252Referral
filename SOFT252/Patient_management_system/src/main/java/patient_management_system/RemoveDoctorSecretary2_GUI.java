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
public class RemoveDoctorSecretary2_GUI extends javax.swing.JFrame {

    /**
     * Creates new form RemoveDoctorSecretary2_GUI
     */
    public RemoveDoctorSecretary2_GUI() {
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

        txtUserId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbUser_Type = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("User ID");

        jLabel5.setText("Select from list: Doctor or Secretary to Delete");

        cmbUser_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Secretary" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cmbUser_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbUser_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
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
        // TODO add your handling code here:
        String userType = cmbUser_Type.getSelectedItem().toString();
            switch(userType) {
                case "Doctor" :
                    
                    ArrayList<Users> doctors = new ArrayList<Users>();
        getData data = new getData();
        
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
        
        
        if(Boolean.TRUE.equals(userTrue)){
        data.removeDoctor(doctors.get(k), doctors);
        aDoctors = doctors.toArray();
        try{
        BufferedWriter clear = new BufferedWriter (new FileWriter("./accounts\\Doctor.txt",false));
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
        
            
            
        String userId = ((User.Doctor)aDoctors[k]).getUserId();
        String aPassword = ((User.Doctor)aDoctors[k]).getPassword();
        String first_Name = ((User.Doctor)aDoctors[k]).getFirst_Name();
        String last_Name = ((User.Doctor)aDoctors[k]).getLast_Name();
        int ratingsLength = ((User.Doctor)aDoctors[k]).getRatingsLength();
        
                        
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
            java.util.logging.Logger.getLogger(RemoveDoctorSecretary2_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveDoctorSecretary2_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveDoctorSecretary2_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveDoctorSecretary2_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveDoctorSecretary2_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbUser_Type;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
