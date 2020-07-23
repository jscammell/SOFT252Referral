/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;

/**
 *
 * @author Josh
 */
public class Secretary_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Secretary_GUI
     */
    public Secretary_GUI() {
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
        btnPatientAccountRequest = new javax.swing.JButton();
        btnPatientDeleteRequest = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        btnOrderMedicine = new javax.swing.JButton();
        btnCreateAppointment = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogOff = new javax.swing.JButton();
        btnApproveAppointment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Secretary");

        btnPatientAccountRequest.setText("Patient Account Request");
        btnPatientAccountRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientAccountRequestActionPerformed(evt);
            }
        });

        btnPatientDeleteRequest.setText("Patient Delete Request");
        btnPatientDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDeleteRequestActionPerformed(evt);
            }
        });

        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        btnOrderMedicine.setText("Order Medicine");
        btnOrderMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMedicineActionPerformed(evt);
            }
        });

        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnLogOff.setText("Log Off");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        btnApproveAppointment.setText("Approve Appointment");
        btnApproveAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                        .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnApproveAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(btnPatientAccountRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnPatientDeleteRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(btnOrderMedicine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreateAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeletePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnPatientAccountRequest)
                .addGap(18, 18, 18)
                .addComponent(btnApproveAppointment)
                .addGap(18, 18, 18)
                .addComponent(btnCreateAppointment)
                .addGap(18, 18, 18)
                .addComponent(btnOrderMedicine)
                .addGap(18, 18, 18)
                .addComponent(btnDeletePatient)
                .addGap(18, 18, 18)
                .addComponent(btnPatientDeleteRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnLogOff))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        this.dispose();        //closes the appliaction when Exit button is pressed
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        Login open = new Login();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();             //Logs the user off and takes the user back to the Login screen
    }//GEN-LAST:event_btnLogOffActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        
        SecretaryCreateAppointment_GUI open = new SecretaryCreateAppointment_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnPatientDeleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDeleteRequestActionPerformed
        SecretaryRequestDeleteAccount_GUI open = new SecretaryRequestDeleteAccount_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnPatientDeleteRequestActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        
        SecretaryDeletePatientAccount_GUI open = new SecretaryDeletePatientAccount_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnPatientAccountRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientAccountRequestActionPerformed
        SecretaryApprovePatientAccount_GUI open = new SecretaryApprovePatientAccount_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_btnPatientAccountRequestActionPerformed

    private void btnApproveAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAppointmentActionPerformed
        
        SecretaryApproveRequestedAppointment_GUI open = new SecretaryApproveRequestedAppointment_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
    }//GEN-LAST:event_btnApproveAppointmentActionPerformed

    private void btnOrderMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMedicineActionPerformed
        
        SecretaryOrderMedicine_GUI open = new SecretaryOrderMedicine_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
    }//GEN-LAST:event_btnOrderMedicineActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveAppointment;
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnOrderMedicine;
    private javax.swing.JButton btnPatientAccountRequest;
    private javax.swing.JButton btnPatientDeleteRequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
