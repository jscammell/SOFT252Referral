/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_management_system;
import Processes.Prescription;
import User.getData;
import java.util.ArrayList;
/**
 *
 * @author Josh
 */
public class PatientViewPrescription_GUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewAppointment_GUI
     */
    public PatientViewPrescription_GUI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtViewAppointment = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("View Prescription");

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

        jLabel4.setText("Your Prescription");

        jLabel5.setText("Please Press Submit Button");

        txtViewAppointment.setColumns(20);
        txtViewAppointment.setRows(5);
        jScrollPane1.setViewportView(txtViewAppointment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(btnBack)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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
        ArrayList<Prescription> Prescription = new ArrayList<Prescription>();
        getData data = new getData();
        try{
        data.readPrescription(Prescription);
        }
        catch(Exception e){
        e.printStackTrace();
        }
        Object[] arrayPrescription = Prescription.toArray();
        int length = arrayPrescription.length;
        
        String[] username = new String[length];
        for (int i = 0; i < length; i++) {
        String name = ((Processes.Prescription)arrayPrescription[i]).getPatient_Id();
        username[i] = name;
            //Reads appointment data
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
        txtViewAppointment.append("Prescription ");
        txtViewAppointment.append(Integer.toString(i));
        txtViewAppointment.append(" : ");
        txtViewAppointment.append("\n");
        
        String doctor_Id = ((Processes.Prescription)arrayPrescription[0]).getDoctor_Id();
        txtViewAppointment.append("doctor_Id: ");
        txtViewAppointment.append(doctor_Id);
        txtViewAppointment.append("\n");
        
        String patient_Id = ((Processes.Prescription)arrayPrescription[0]).getPatient_Id();
        txtViewAppointment.append("patient_Id: ");
        txtViewAppointment.append(patient_Id);
        txtViewAppointment.append("\n");
        
        String doctor_Notes = ((Processes.Prescription)arrayPrescription[0]).getDoctor_Notes();
        txtViewAppointment.append("doctor_Notes: ");
        txtViewAppointment.append(doctor_Notes);
        txtViewAppointment.append("\n");
        
        String medicine = ((Processes.Prescription)arrayPrescription[0]).getMedicine();
        txtViewAppointment.append("medicine: ");
        txtViewAppointment.append(medicine);
        txtViewAppointment.append("\n");
        
        int quantity = ((Processes.Prescription)arrayPrescription[0]).getQuantity();
        txtViewAppointment.append("quantity: ");
        txtViewAppointment.append(Integer.toString(quantity));
        txtViewAppointment.append("\n");
        
        String dosage = ((Processes.Prescription)arrayPrescription[0]).getDosage();
        txtViewAppointment.append("dosage: ");
        txtViewAppointment.append(dosage);
        txtViewAppointment.append("\n");
        
        txtViewAppointment.append("\n"); 

       
                
        break;
            //Prints data relating to above username
                
        }
        }
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextArea txtViewAppointment;
    // End of variables declaration//GEN-END:variables
}
