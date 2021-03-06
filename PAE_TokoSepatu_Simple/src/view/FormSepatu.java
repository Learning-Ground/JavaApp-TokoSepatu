/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SepatuDAO;
import controller.Sepatu_SupplierDAO;
import controller.SupplierDAO;
import java.awt.event.WindowEvent;
import java.util.UUID;
import javax.swing.JOptionPane;
import model.Sepatu;
import model.Sepatu_Supplier;
import model.Supplier;

/**
 *
 * @author lexs
 */
public class FormSepatu extends javax.swing.JFrame {

    /**
     * Creates new form FormSepatu
     */
    private SupplierDAO supDAO;
    private Supplier sup;
    private SepatuDAO sptDAO;
    private Sepatu_SupplierDAO ssDAO;
    private FormTokoSepatu parentForm;
    
    public FormSepatu() {
        initComponents();
    }
    
    public FormSepatu(SupplierDAO suDAO, SepatuDAO sDAO, String supID, String id, FormTokoSepatu parenta){
        initComponents();
        sup = new Supplier();
        supDAO = suDAO;
        sptDAO = sDAO;
        ssDAO = new Sepatu_SupplierDAO();
        parentForm = parenta;
        textID.setText(UUID.randomUUID().toString());
        sup = supDAO.GetSupplier(supID);
        textSupplier.setText(sup.getNama_supplier());
        if(!id.equals("")){
            textID.setText(id);
            for(int i=0; i < cbJenis.getItemCount();i++){
                if(cbJenis.getItemAt(i).toString().equals(sptDAO.GetSepatu(id).getJenis())){
                    cbJenis.setSelectedIndex(i);
                }
            }
            btnInsert.setText("UPDATE");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNama = new javax.swing.JTextField();
        textID = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textSupplier = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        textID.setEditable(false);

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("ID");

        textSupplier.setEditable(false);

        jLabel3.setText("Supplier");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kantoran", "Olahraga", "Sandal", "Santai" }));

        jLabel4.setText("Jenis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSupplier)
                            .addComponent(textID, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-301)/2, (screenSize.height-161)/2, 301, 161);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        Sepatu spt = new Sepatu();
        if(textID.getText().equals("") || textNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Semua data harus terisi !!!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        spt.setId_sepatu(textID.getText());
        spt.setJenis(cbJenis.getSelectedItem().toString());
        spt.setNama_sepatu(textNama.getText());
        if(btnInsert.getText().equals("INSERT")) sptDAO.Insert(spt);
        else if(btnInsert.getText().equals("UPDATE")) sptDAO.Update(spt);
        
        //===========================================SUPLI_SEPATU==============================
        Sepatu_Supplier ss = new Sepatu_Supplier();
        ss.setId(UUID.randomUUID().toString());
        ss.setId_supplier(sup.getId_supplier());
        ss.setId_sepatu(textID.getText());
        if(btnInsert.getText().equals("INSERT")) ssDAO.Insert(ss);
        //===========================================SUPLI_SEPATU==============================
        
        parentForm.LihatDataSepatu();
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(FormSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSepatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSepatu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textSupplier;
    // End of variables declaration//GEN-END:variables
}
