package Aplikasi;

import app.db.Mahasiswa;
import app.db.MahasiswaManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class jendelautama extends javax.swing.JFrame {

   List<Mahasiswa> mahasiswa = new ArrayList<>();
    int currentRow = 0;
//Constructor
    public jendelautama() {
        String lookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
            try {
                javax.swing.UIManager.setLookAndFeel(lookAndFeel);
            } catch (Exception e) {
            }
       
            initComponents();
                loadData();
                bindData();

                txtNoBP.setEditable(false);
                txtNama.setEditable(false);
                txtTmpLahir.setEditable(false);
                txtTglLahir.setEditable(false);
                txtAlamat.setEditable(false);
                txtPhone.setEditable(false);
                txtAsalSekolah.setEditable(false);
            
            
    }
    private void loadData() {
        MahasiswaManager mhsmgr = new MahasiswaManager();
        mahasiswa = mhsmgr.getMahasiswa();
        mhsmgr.closeConnection();
    }
     private void bindData() {
        if (mahasiswa.size()>0) {
            Mahasiswa m = mahasiswa.get(currentRow);
            txtNoBP.setText(m.getnobp());
            txtNama.setText(m.getnama());
            txtTmpLahir.setText(m.gettmplahir());
            txtTglLahir.setText(m.gettgllahir());
            txtAlamat.setText(m.getalamat());
            txtPhone.setText(m.getphone());
            txtAsalSekolah.setText(m.getasalsekolah());
        } else {
            currentRow = 0;
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
        }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNoBP = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTmpLahir = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAsalSekolah = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        txtTglLahir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No Bp");

        jLabel2.setText("Nama");

        jLabel3.setText("Tempat/Tgl Lahir");

        jLabel4.setText("Alamat");

        jLabel6.setText("No Telphone");

        jLabel7.setText("Asal Sekolah");

        txtTmpLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTmpLahirActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNew.setText("Baru");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel8.setText("/");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel9.setText("data Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(txtNoBP, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAsalSekolah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrev)
                                .addGap(34, 34, 34)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnNew)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTmpLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTmpLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTmpLahirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("Edit")){
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
            txtNoBP.setEditable(true);
            txtNama.setEditable(true);
            txtTmpLahir.setEditable(true);
            txtTglLahir.setEditable(true);
            txtAlamat.setEditable(true);
            txtPhone.setEditable(true);
            txtAsalSekolah.setEditable(true);
            txtNoBP.requestFocus();
            btnNew.setText("Simpan");
            btnDelete.setText("Batal");
            btnEdit.setEnabled(false);
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            MahasiswaManager mhsmgr = new MahasiswaManager();
            Mahasiswa m = new Mahasiswa();
            m.setnobp(txtNoBP.getText());
            m.setnama(txtNama.getName());
            m.settmplahir(txtTmpLahir.getText());
            m.settgllahir(txtTglLahir.getText());
            m.setalamat(txtAlamat.getText());
            m.setphone(txtPhone.getText());
            m.setasalsekolah(txtAsalSekolah.getText());
               if (mhsmgr.Update(m)>0){
                    loadData();
                    bindData();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
           txtNoBP.setEditable(false);
           txtNama.setEditable(false);
           txtTmpLahir.setEditable(false);
           txtTglLahir.setEditable(false);
           txtAlamat.setEditable(false);
           txtPhone.setEditable(false);
           txtAsalSekolah.setEditable(false);
           btnNew.setText("Baru");
           btnDelete.setText("Hapus");
           btnPrev.setEnabled(true);
           btnNext.setEnabled(true);
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("New")){
           txtNoBP.setText("");
           txtNama.setText("");
           txtTmpLahir.setText("");
           txtTglLahir.setText("");
           txtAlamat.setText("");
           txtPhone.setText("");
           txtAsalSekolah.setText("");
           txtNoBP.setEditable(true);
           txtNama.setEditable(true);
           txtTmpLahir.setEditable(true);
           txtTglLahir.setEditable(true);
           txtAlamat.setEditable(true);
           txtPhone.setEditable(true);
           txtAsalSekolah.setEditable(true);
           txtNoBP.requestFocus();
           btnNew.setText("Simpan");
           btnDelete.setText("Batal");
           btnEdit.setEnabled(false);
           btnPrev.setEnabled(false);
           btnNext.setEnabled(false);
           }else {
           if (!txtNoBP.getText().equals("") && !txtNama.getText().equals("")){
           MahasiswaManager mhsmgr = new MahasiswaManager();
           Mahasiswa m = new Mahasiswa();
           m.setnobp(txtNoBP.getText());
           m.setnama(txtNama.getText());
           m.settmplahir(txtTmpLahir.getText());
           m.settgllahir(txtTglLahir.getText());
           m.setalamat(txtAlamat.getText());
           m.setphone(txtPhone.getText());
           m.setasalsekolah(txtAsalSekolah.getText());
           if (mhsmgr.Insert(m)>0) {
               loadData();
               currentRow = mahasiswa.size()-1;
               bindData();
               JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
           } else {
              JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
           }
           txtNoBP.setEditable(false);
           txtNama.setEditable(false);
           txtTmpLahir.setEditable(false);
           txtTglLahir.setEditable(false);
           txtAlamat.setEditable(false);
           txtPhone.setEditable(false);
           txtAsalSekolah.setEditable(false);
           btnNew.setText("Baru");
           btnDelete.setText("Hapus");
           btnEdit.setEnabled(true);
           btnPrev.setEnabled(true);
           btnNext.setEnabled(true);
           mhsmgr.closeConnection();
          } else {
           JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
          }
    }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (btnDelete.getText().equals("Delete")){
             int dialog = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Akan Menghapus Data Ini ?","Konfirmasi", JOptionPane.YES_NO_OPTION);
             MahasiswaManager mhsmgr = new MahasiswaManager();

             Mahasiswa m = mahasiswa.get(currentRow);

                if (dialog == JOptionPane.YES_NO_OPTION) {
                    if (mhsmgr.Delete(m)>0){
                        loadData();
                        currentRow = currentRow - 1;
                        bindData();
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
             } else if (btnDelete.getText().equals("Batal")) {
                loadData();
                bindData();
                btnNew.setText("Baru");
                btnEdit.setText("Edit");
                btnDelete.setText("Hapus");
                btnEdit.setEnabled(true);
                btnNew.setEnabled(true);
                btnNext.setEnabled(true);
                btnPrev.setEnabled(true);
                txtNoBP.setEditable(false);
                txtNama.setEditable(false);
                txtTmpLahir.setEditable(false);
                txtTglLahir.setEditable(false);
                txtAlamat.setEditable(false);
                txtPhone.setEditable(false);
                txtAsalSekolah.setEditable(false);
             }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (currentRow < mahasiswa.size()-1){
                 ++currentRow;
                 btnPrev.setEnabled(true);
                 }else {
                 btnNext.setEnabled(false);
                 }
                 bindData();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       if (currentRow < mahasiswa.size()-1){
                 --currentRow;
                 btnPrev.setEnabled(true);
                 }else {
                 btnNext.setEnabled(false);
                 }
                 bindData();
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(jendelautama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jendelautama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jendelautama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jendelautama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jendelautama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAsalSekolah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoBP;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTglLahir;
    private javax.swing.JTextField txtTmpLahir;
    // End of variables declaration//GEN-END:variables
}
