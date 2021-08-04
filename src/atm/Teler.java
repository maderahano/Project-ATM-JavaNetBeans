/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import atm.Nasabah;

/**
 *
 * @author Asus
 */
public class Teler extends javax.swing.JFrame 
{
    mainMenu var;
    /**
     * Creates new form Teler
     */
    public Teler(mainMenu data) 
    {
        var = data;
        this.user = new ArrayList<Nasabah>();
        initComponents();
    }
    List<Nasabah> user;
    
    private boolean onlyContainsNumbers(String text) 
    {
        try 
        {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException ex) 
        {
            return false;
        }
    }
    
    public void buatAkun() 
    {
        Nasabah a = new Nasabah();
        if (a.getNomorRekening() == a.getNomorRekening()) 
        {
            int noRek = user.size() + 1;
            a.setNomorRekening(noRek); 
        }
        do 
        {
            String s = "";
            String nm = JOptionPane.showInputDialog("Input Nama", s);
            a.setNama(nm);
            if (!a.getNama().matches("[a-zA-Z]+")) 
            {
                JOptionPane.showMessageDialog(null, "Nama yang Anda Input Invalid ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
            if (a.getNama().matches("[a-zA-Z]+")) 
            {
                a.nama1 = a.getNama();
            }
        } while (!a.getNama().matches("[a-zA-Z]+"));
        do 
        {
            String ab = "";
            String uname = JOptionPane.showInputDialog("Input Username", ab);
            a.setLogin(uname);
            if (a.getLogin().equals("")) 
            {     
                JOptionPane.showMessageDialog(null, "Username Tidak Boleh Kosong", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }        
            else 
            {
                String usr = a.getLogin();
                a.setLogin(usr);
            }
        } while (a.getLogin().equals(""));
        String s1 = "";

        do 
        {
            String p = JOptionPane.showInputDialog("Input 5 Digit Kode PIN", s1);
            a.setPIN(p);
            if (a.getPIN().matches("[0-9]{5}")) 
            {
                a.PIN1 = a.getPIN();
            } else 
            {
                JOptionPane.showMessageDialog(null, "Mohon Input 5 Digit Kode PIN ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!a.getPIN().matches("[0-9]{5}"));
        String s2 = "";
        do 
        {
            s2 = JOptionPane.showInputDialog("Input Saldo Awal ");
            if (onlyContainsNumbers(s2)) 
            {
                int sal = Integer.parseInt(s2);
                a.setSaldo(sal);
            } else 
            {
                JOptionPane.showMessageDialog(null, "Harap Input Angka Saja  ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!onlyContainsNumbers(s2));
        String[] s0 = {"Silver", "Gold"};
        String[] s01 = {"Active", "Disable"};
        a.status = (String) JOptionPane.showInputDialog(null, "Pilih Status...", "Status Akun", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
        a.level = (String) JOptionPane.showInputDialog(null, "Pilih Level...", "Level Akun", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
        a.tanggal = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
        user.add(a);
        var.user1 = this.user;
        JOptionPane.showMessageDialog(null, "Akun Sukses Dibuat....");
    }
    
    public void search() 
    {
        String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tPilih Metode untuk Mencari Akun\n1-Cari Berdasarkan Nomor Akun\n2-Cari Berdasarkan Nama Pemegang ", s00);
        switch (s0) {
            case "1":
                Akun cariNo = new searchNomorAkun();
                cariNo.info(user);
                break;
            case "2":
                Akun cariNam = new searchNamaAkun();
                cariNam.info(user);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Opsi ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    
        public void updateAkun() 
    {
        String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tMenu Opsi untuk Update Akun\n1-Nomor Akun\n2-Nama Nasabah  ", s00);
        switch (s0) {
            case "1":
                Akun upNo = new updateNomorAkun(); 
                upNo.info(user);
                break;
            case "2":
                Akun upNam = new updateNamaAkun();
                upNam.info(user);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Opsi ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    
    public boolean loginTeller()
    {
        String username1 = "",PIN1="",username12 = "",PIN2="";
        
        username1 = JOptionPane.showInputDialog("Input Username ", username12);
        PIN1 = JOptionPane.showInputDialog("Input PIN  ", PIN2);
        boolean found = false;
        for (int i = 0; i < user.size(); i++) 
        {
            Nasabah varLog = user.get(i);
            if (varLog.getLogin().equals(username1) && varLog.getPIN().equals(PIN1)) 
            {
                JOptionPane.showMessageDialog(null, "Anda Berhasil Login!");
                var.var1 = varLog;
                found = true;
            }
        } 
        if (!found) 
        {
            JOptionPane.showMessageDialog(null, "Username/Password Anda Salah!");
        }
        return found;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKiri4 = new javax.swing.JButton();
        btnKanan4 = new javax.swing.JButton();
        btnKanan3 = new javax.swing.JButton();
        btnKiri1 = new javax.swing.JButton();
        btnKanan1 = new javax.swing.JButton();
        btnKiri2 = new javax.swing.JButton();
        btnKiri3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnKanan2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKiri4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKiri4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiri4ActionPerformed(evt);
            }
        });

        btnKanan4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKanan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKanan4ActionPerformed(evt);
            }
        });

        btnKanan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKanan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKanan3ActionPerformed(evt);
            }
        });

        btnKiri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKiri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiri1ActionPerformed(evt);
            }
        });

        btnKanan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKanan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKanan1ActionPerformed(evt);
            }
        });

        btnKiri2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKiri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiri2ActionPerformed(evt);
            }
        });

        btnKiri3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKiri3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiri3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 0));
        jLabel37.setText("PT. BANK MANDIRI");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 0));
        jLabel38.setText("SELAMAT DATANG DI TELER");

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 0));
        jLabel39.setText("<-- Setor Tunai");

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 0));
        jLabel42.setText("<-- Tarik Tunai");

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 0));
        jLabel41.setText("<-- Pembayaran");

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 0));
        jLabel43.setText("<-- Transfer");

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 0));
        jLabel40.setText("Update Akun --->");

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 0));
        jLabel34.setText("Cari Akun --->");

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 0));
        jLabel36.setText("Buat Akun --->");

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 0));
        jLabel35.setText("Keluar --->");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel38)
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(117, 117, 117))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel42))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel43))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel35))
                .addContainerGap())
        );

        btnKanan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/icons/empty.png"))); // NOI18N
        btnKanan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKanan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnKiri3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKiri4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKiri2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKiri1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKanan4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKanan3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKanan2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnKiri1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKiri2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKiri3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKiri4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnKanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKanan2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKanan3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnKanan4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKanan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKanan1ActionPerformed
        buatAkun();
    }//GEN-LAST:event_btnKanan1ActionPerformed

    private void btnKanan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKanan2ActionPerformed
        search();
    }//GEN-LAST:event_btnKanan2ActionPerformed

    private void btnKanan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKanan3ActionPerformed
        updateAkun();
    }//GEN-LAST:event_btnKanan3ActionPerformed

    private void btnKanan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKanan4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnKanan4ActionPerformed

    private void btnKiri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiri1ActionPerformed
        boolean hasil = loginTeller();
        if(hasil)
        {
            setorTunai setor = new setorTunai();
            setor.info(var);
        }
    }//GEN-LAST:event_btnKiri1ActionPerformed

    private void btnKiri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiri2ActionPerformed
        boolean hasil = loginTeller();
        if(hasil)
        {
            tarikTunai tarik = new tarikTunai();
            tarik.info(var);      
        }
    }//GEN-LAST:event_btnKiri2ActionPerformed

    private void btnKiri3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiri3ActionPerformed
        boolean hasil = loginTeller();
        if(hasil)
        {
            transferBank transfer = new transferBank();
            transfer.info(var,"Teller");      
        }
    }//GEN-LAST:event_btnKiri3ActionPerformed

    private void btnKiri4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiri4ActionPerformed
        boolean hasil = loginTeller();
        if(hasil)
        {
            pembayaranTagihan transfer = new pembayaranTagihan();
            transfer.info(var);      
        }
    }//GEN-LAST:event_btnKiri4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Teler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new ADMIN().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKanan1;
    private javax.swing.JButton btnKanan2;
    private javax.swing.JButton btnKanan3;
    private javax.swing.JButton btnKanan4;
    private javax.swing.JButton btnKiri1;
    private javax.swing.JButton btnKiri2;
    private javax.swing.JButton btnKiri3;
    private javax.swing.JButton btnKiri4;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
