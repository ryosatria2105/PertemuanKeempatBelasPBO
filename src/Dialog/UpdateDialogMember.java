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

public class UpdateDialogMember extends javax.swing.JDialog {

    private boolean update = false;

    public UpdateDialogMember(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public UpdateDialogMember(java.awt.Frame parent, boolean modal, String idMember) {
    super(parent, modal);
    initComponents();
    loadComboPaket();   // wajib sebelum setSelectedItem()

    // load data dari DB berdasarkan ID
    var em = JPAUtil.getEntityManager();
    var m = em.find(MemberGym.class, idMember);
    em.close();

    txtIdMemberUpdate.setText(m.getIdMember());
    txtNamaMemberUpdate.setText(m.getNama());
    txtAlamatMemberUpdate.setText(m.getAlamat());
    cbPaketMemberUpdate.setSelectedItem(m.getPaket().getNamaPaket());
}
    private void loadComboPaket() {
    var em = JPAUtil.getEntityManager();
    try {
        var list = em.createQuery(
            "SELECT p FROM PaketGym p ORDER BY p.namaPaket",
            PaketGym.class
        ).getResultList();

        cbPaketMemberUpdate.removeAllItems();  // atau cbPaketMemberUpdate

        for (PaketGym p : list) {
            cbPaketMemberUpdate.addItem(p.getNamaPaket());  
        }
    } finally {
        em.close();
    }
}




    

    public boolean isUpdated() {
        return update;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdMemberUpdate = new javax.swing.JTextField();
        txtNamaMemberUpdate = new javax.swing.JTextField();
        txtAlamatMemberUpdate = new javax.swing.JTextField();
        btnSaveMemberUpdate = new javax.swing.JButton();
        jId = new javax.swing.JLabel();
        jGenre = new javax.swing.JLabel();
        jJudul = new javax.swing.JLabel();
        jHarga = new javax.swing.JLabel();
        cbPaketMemberUpdate = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE DATA MEMBER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txtIdMemberUpdate.setEditable(false);
        txtIdMemberUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMemberUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdMemberUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 140, 370, 38));

        txtNamaMemberUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaMemberUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(txtNamaMemberUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 198, 370, 37));
        getContentPane().add(txtAlamatMemberUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 253, 370, 36));

        btnSaveMemberUpdate.setBackground(new java.awt.Color(0, 0, 102));
        btnSaveMemberUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSaveMemberUpdate.setForeground(new java.awt.Color(204, 255, 255));
        btnSaveMemberUpdate.setText("SAVE");
        btnSaveMemberUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 204)));
        btnSaveMemberUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMemberUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveMemberUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 100, 40));

        jId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jId.setText("ID Member");
        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 155, -1, -1));

        jGenre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jGenre.setText("Alamat");
        getContentPane().add(jGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 258, -1, -1));

        jJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jJudul.setText("Nama");
        getContentPane().add(jJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 206, 55, 16));

        jHarga.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jHarga.setText("Tipe Paket");
        getContentPane().add(jHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 312, 110, -1));

        getContentPane().add(cbPaketMemberUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 310, 370, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dialog/2222.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 810, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaMemberUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaMemberUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaMemberUpdateActionPerformed

    private void btnSaveMemberUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMemberUpdateActionPerformed
var em = JPAUtil.getEntityManager();
    em.getTransaction().begin();

    MemberGym m = em.find(MemberGym.class, txtIdMemberUpdate.getText());

    String namaPaket = cbPaketMemberUpdate.getSelectedItem().toString();
    PaketGym paket = em.createQuery(
            "SELECT p FROM PaketGym p WHERE p.namaPaket = :n",
            PaketGym.class
    ).setParameter("n", namaPaket).getSingleResult();

    m.setNama(txtNamaMemberUpdate.getText());
    m.setAlamat(txtAlamatMemberUpdate.getText());
    m.setPaket(paket);

    em.getTransaction().commit();
    em.close();

        boolean saved = true; // ✅ Penting!
    JOptionPane.showMessageDialog(this, "Data Member berhasil diupdate!");
    dispose();      // ✅ Tutup dialog setelah sukses
    }//GEN-LAST:event_btnSaveMemberUpdateActionPerformed

    private void txtIdMemberUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMemberUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMemberUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveMemberUpdate;
    private javax.swing.JComboBox<String> cbPaketMemberUpdate;
    private javax.swing.JLabel jGenre;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAlamatMemberUpdate;
    private javax.swing.JTextField txtIdMemberUpdate;
    private javax.swing.JTextField txtNamaMemberUpdate;
    // End of variables declaration//GEN-END:variables

    void setMemberFrame(MemberFrame aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadComboBoxPaket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isSaved() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
