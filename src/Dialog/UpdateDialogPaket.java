/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Dialog;

/**
 *
 * @author Ryo
 */
import Dialog.MemberFrame;
import Dialog.MemberGym;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class UpdateDialogPaket extends javax.swing.JDialog {

    private boolean update = false;

    public UpdateDialogPaket(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public UpdateDialogPaket(java.awt.Frame parent, boolean modal, String idPaket, String namaPaket, String durasi, String harga) {
    super(parent, modal);
    initComponents();

    txtIdPaketUpdate.setText(idPaket);
    txtNamaPaketUpdate.setText(namaPaket);
    txtDurasiPaketUpdate.setText(durasi);
    txtHargaPaketUpdate.setText(harga);
}


    UpdateDialogPaket(MemberFrame aThis, boolean b, String id, String nama, String tipe, String coach) {
        super(aThis, b);
        initComponents();

        txtIdPaketUpdate.setText(id);
        txtNamaPaketUpdate.setText(nama);
        txtDurasiPaketUpdate.setText(tipe);
        txtHargaPaketUpdate.setText(String.valueOf(coach));
        txtIdPaketUpdate.setEditable(false);
    }

    

    public boolean isUpdated() {
        return update;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdPaketUpdate = new javax.swing.JTextField();
        txtNamaPaketUpdate = new javax.swing.JTextField();
        txtDurasiPaketUpdate = new javax.swing.JTextField();
        txtHargaPaketUpdate = new javax.swing.JTextField();
        btnSavePaketUpdate = new javax.swing.JButton();
        jId = new javax.swing.JLabel();
        jGenre = new javax.swing.JLabel();
        jJudul = new javax.swing.JLabel();
        jHarga = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE DATA MEMBER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txtIdPaketUpdate.setEditable(false);
        txtIdPaketUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPaketUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdPaketUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 149, 367, 38));

        txtNamaPaketUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPaketUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtNamaPaketUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 198, 367, 37));
        getContentPane().add(txtDurasiPaketUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 253, 367, 36));
        getContentPane().add(txtHargaPaketUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 307, 367, 37));

        btnSavePaketUpdate.setBackground(new java.awt.Color(0, 0, 102));
        btnSavePaketUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSavePaketUpdate.setForeground(new java.awt.Color(204, 255, 255));
        btnSavePaketUpdate.setText("SAVE");
        btnSavePaketUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 204)));
        btnSavePaketUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePaketUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnSavePaketUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 100, 40));

        jId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jId.setText("ID Paket");
        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 155, -1, -1));

        jGenre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jGenre.setText("Durasi");
        getContentPane().add(jGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 258, -1, -1));

        jJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jJudul.setText("Nama Paket");
        getContentPane().add(jJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 206, 120, 16));

        jHarga.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jHarga.setText("Harga");
        getContentPane().add(jHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 312, 64, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dialog/2222.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaPaketUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPaketUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPaketUpdateActionPerformed

    private void btnSavePaketUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePaketUpdateActionPerformed
       try {
        String id = txtIdPaketUpdate.getText();
        String nama = txtNamaPaketUpdate.getText();
        String durasi = txtDurasiPaketUpdate.getText();
        double harga = Double.parseDouble(txtHargaPaketUpdate.getText());

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        PaketGym p = em.find(PaketGym.class, id);
        p.setNamaPaket(nama);
        p.setDurasi(durasi);
        p.setHarga(harga);

        em.getTransaction().commit();
        em.close();

        JOptionPane.showMessageDialog(this, "Paket berhasil di-update!");
        dispose();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harga harus angka!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "❌ Error update: " + e.getMessage());
    }
    }//GEN-LAST:event_btnSavePaketUpdateActionPerformed

    private void txtIdPaketUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPaketUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPaketUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePaketUpdate;
    private javax.swing.JLabel jGenre;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDurasiPaketUpdate;
    private javax.swing.JTextField txtHargaPaketUpdate;
    private javax.swing.JTextField txtIdPaketUpdate;
    private javax.swing.JTextField txtNamaPaketUpdate;
    // End of variables declaration//GEN-END:variables

    void setMemberFrame(MemberFrame aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
