/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.view;

import gestioncolis.Extras;
import javax.swing.JFrame;
import gestioncolis.dao.*;
import gestioncolis.model.*;
import gestioncolis.service.*;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yassine
 */
public class AjouterColis extends javax.swing.JFrame {

    /**
     * Creates new form AjouterColis
     */
    
    Colis_PhysiqueDao cpdao = new Colis_PhysiqueDao();
    Colis_MoraleDao cmdao = new Colis_MoraleDao();
    
    Person_Physique person1 = null;
    Person_Morale person2 = null;
    
    String reference;
    
    Extras extra = new Extras();
    
    public AjouterColis() {
        initComponents();
    }
    
    public AjouterColis(Person_Physique person) {
        initComponents();
        this.person1 = person;
        reference = extra.makeReference();
        ReferenceText.setText(reference);
    }
    
    public AjouterColis(Person_Morale person) {
        initComponents();
        this.person2 = person;
        Address_SourceText.setVisible(false);
        LabelSource.setVisible(false);
        reference = extra.makeReference();
        ReferenceText.setText(reference);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        ReferenceText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Address_DestinationText = new javax.swing.JTextField();
        LabelSource = new javax.swing.JLabel();
        Address_SourceText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PoidsText = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        PrixText = new javax.swing.JLabel();
        Ajouter = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ajouter Colis");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("description");

        DescriptionText.setColumns(20);
        DescriptionText.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        DescriptionText.setRows(5);
        jScrollPane1.setViewportView(DescriptionText);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Reference");

        ReferenceText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReferenceText.setText("Llitytlhvtxsdtwg");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Address destination");

        Address_DestinationText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        LabelSource.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelSource.setText("Address Source");

        Address_SourceText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Poids");

        PoidsText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PoidsText.setModel(new javax.swing.SpinnerNumberModel(0.1d, 0.1d, 31.0d, 0.5d));
        PoidsText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Prix");

        PrixText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrixText.setText("00");

        Ajouter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        Annuler.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReferenceText)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(LabelSource)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Address_DestinationText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Address_SourceText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PoidsText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PrixText)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel8)
                                        .addGap(306, 306, 306)))))
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Annuler)
                        .addGap(18, 18, 18)
                        .addComponent(Ajouter)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ReferenceText))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Address_DestinationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSource)
                    .addComponent(Address_SourceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PoidsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PrixText))
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ajouter)
                    .addComponent(Annuler))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowOpened

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        
        if(checkEmpty()){
            JOptionPane.showMessageDialog(null, "Entrer tous les valeurs demander");
        }else{
            if(person1!=null){
                Colis_Physique colis = getColis_Physique();
                if(cpdao.insertColis(colis)){
                    JOptionPane.showMessageDialog(null, "Ajout avec success");
                    Home.TableColis.setModel(new DefaultTableModel(null,new Object[]{"Reference","Description","Address","Status","Poids","Prix"}));
                    extra.ColisTable(Home.TableColis, person1.getId(), 0);
                    setEmpty();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Error echec d'ajout");
                }
                
                
            }else if(person2!= null){
                Colis_Morale colis = getColis_Morale();
                if(cmdao.insertColis(colis)){
                    JOptionPane.showMessageDialog(null, "Ajout avec success");
                    Home.TableColis.setModel(new DefaultTableModel(null,new Object[]{"Reference","Description","Address","Status","Poids","Prix"}));
                    extra.ColisTable(Home.TableColis, person1.getId(), 1);
                    setEmpty();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Error echec d'ajout");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error user undefined");
            }
        }
        
        
    }//GEN-LAST:event_AjouterActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterColis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterColis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterColis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterColis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterColis().setVisible(true);
            }
        });
    }
    
    public boolean checkEmpty(){
        return ("".equals(Address_SourceText.getText()) || "".equals(Address_DestinationText.getText()) || (double )PoidsText.getValue() == 0
                || "".equals(DescriptionText.getText()));
    }
    
    public void setEmpty(){
        Address_SourceText.setText("");
        Address_DestinationText.setText("");
        PoidsText.setValue(0.1);
        DescriptionText.setText("");
    }
    
    public Colis_Physique getColis_Physique(){
        String reference = this.reference;
        String address_source = Address_SourceText.getText();
        String address_destination = Address_DestinationText.getText();
        String description = DescriptionText.getText();
        double poids = (double) PoidsText.getValue();
        double prix = Double.parseDouble(PrixText.getText());
        int user_id = person1.getId();
        Date date = new Date(System.currentTimeMillis());
        String status = "En cours";
        
        return new Colis_Physique(description,reference,address_source,address_destination,status,date,poids,prix,user_id);
    }
    
    public Colis_Morale getColis_Morale(){
        String reference = this.reference;
        String address_source = person2.getAddress();
        String address_destination = Address_DestinationText.getText();
        String description = DescriptionText.getText();
        int poids = (int) PoidsText.getValue();
        double prix = Double.parseDouble(PrixText.getText());
        int user_id = person1.getId();
        Date date = new Date(System.currentTimeMillis());
        String status = "En cours";
        
        return new Colis_Morale(description,reference,address_source,address_destination,status,date,poids,prix,user_id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address_DestinationText;
    private javax.swing.JTextField Address_SourceText;
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Annuler;
    private javax.swing.JTextArea DescriptionText;
    private javax.swing.JLabel LabelSource;
    private javax.swing.JSpinner PoidsText;
    private javax.swing.JLabel PrixText;
    private javax.swing.JLabel ReferenceText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}