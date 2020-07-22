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
public class Administrator_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    public Administrator_GUI() {
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
        btnAdd = new javax.swing.JButton();
        btnDoctorRatings = new javax.swing.JButton();
        btnCreateAdministrator = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogOff = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Administrator");

        btnAdd.setText("Add Doctor and Secretary");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDoctorRatings.setText("View Doctor Ratings");
        btnDoctorRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorRatingsActionPerformed(evt);
            }
        });

        btnCreateAdministrator.setText("Create New Administrator");
        btnCreateAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdministratorActionPerformed(evt);
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

        btnRemove.setText("Remove Doctor and Secretary");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoctorRatings, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(btnCreateAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))))
                .addGap(0, 99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(btnCreateAdministrator)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnRemove)
                .addGap(18, 18, 18)
                .addComponent(btnDoctorRatings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnLogOff))
                .addContainerGap())
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

    private void btnCreateAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdministratorActionPerformed
        CreateAdministrator_GUI open = new CreateAdministrator_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose(); //Opens create administrator form
    }//GEN-LAST:event_btnCreateAdministratorActionPerformed

    private void btnDoctorRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorRatingsActionPerformed
        AdminDoctorRating_GUI open = new AdminDoctorRating_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnDoctorRatingsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddDoctorSecretary_GUI open = new AddDoctorSecretary_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        RemoveDoctorSecretary_GUI open = new RemoveDoctorSecretary_GUI();
        open.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreateAdministrator;
    private javax.swing.JButton btnDoctorRatings;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}