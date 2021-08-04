/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class updateNamaAkun extends Akun
{
    List<Nasabah> user;

    public updateNamaAkun() {}
   
    public updateNamaAkun(List<Nasabah> user1)
    {
        user = user1;
    }
    
    public void info(List<Nasabah> user1)
    {
        user = user1;
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Input Nama Akun Kamu yang Ingin Kamu Update", s2);
        boolean found = false;
        //this.user=l.user1;
        String[] columns = new String[]{"Nomor Akun", "Nama", "PIN", "Username", "Saldo", "Status", "Level", "Tanggal"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) 
        {
            Nasabah akun = user.get(i);
            if (akun.getNama().equals(s1)) 
            {
                rows[0] = new Object[]{akun.getNomorRekening(), akun.getNama(), akun.getPIN(),akun.getLogin(), akun.getSaldo(), akun.status, akun.level, akun.tanggal};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "Apakah Kamu Ingin Meng-update Akun Ini?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (a == 0) 
                {
                    rows[0] = new Object[]{akun.getNomorRekening(), akun.getNama(), akun.getPIN(), akun.getLogin(), akun.getSaldo(), akun.status, akun.level, akun.tanggal};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                    String[] s0 = {"Silver", "Gold"};
                    String[] s01 = {"Active", "Deactive"};
                    String s = "";
                    String ab = "";
                    akun.login1 = JOptionPane.showInputDialog("Input Username", ab);
                    if (akun.login1.equals("")) 
                    {
                        String log = akun.getLogin();
                        akun.setLogin(log);

                    } else 
                    {
                        String log = akun.login1;
                        akun.setLogin(log);
                    }
                    do 
                    {
                        akun.nama1 = JOptionPane.showInputDialog("Input Nama", s);
                        if (akun.nama1.equals("")) 
                        {
                            String nm = akun.getNama();
                            akun.setNama(nm);
                            break;
                        }
                        
                        if (akun.nama1.matches("[a-zA-Z]+")) 
                        {
                            String nm = akun.nama1;
                            akun.setNama(nm);
                            break;
                        } else 
                        {
                            JOptionPane.showMessageDialog(null, "Nama yang Anda Input Invalid", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!akun.nama1.matches("[a-zA-Z]+"));
                    String s11 = "";

                    do 
                    {
                        akun.PIN1 = JOptionPane.showInputDialog("Input 5 Digit Kode PIN", s11);
                        if (akun.PIN1.matches("[0-9]{5}")) 
                        {
                            String p = akun.PIN1;
                            akun.setPIN(p);
                            break;
                        }
                        if (akun.PIN1.equals("")) 
                        {
                            String p = akun.getPIN();
                            akun.setPIN(p);
                            break;
                        } else 
                        {
                            JOptionPane.showMessageDialog(null, "Mohon Input 5 Digit Kode PIN ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (!akun.PIN1.matches("[0-9]{5}"));
                    akun.status = (String) JOptionPane.showInputDialog(null, "Pilih Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                    akun.level = (String) JOptionPane.showInputDialog(null, "Pilih Level...", "Level", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                    // user.add(akun);
                    JOptionPane.showMessageDialog(null, "Akun Anda Sukses di-Update... ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                    String[] columnss = new String[]{"Nomor Akun", "Nama", "PIN", "Username", "Saldo", "Status", "Level", "Tanggal"};
                    Object[][] rowss = new Object[1][columnss.length];
                    rowss[0] = new Object[]{akun.getNomorRekening(), akun.getNama(), akun.getPIN(), akun.getLogin(), akun.getSaldo(), akun.status, akun.level, akun.tanggal};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                } else if (a == 1) 
                {
                    JOptionPane.showMessageDialog(null, "Akun Anda Tidak Terupdate!", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                }
            }
        }
        if (!found) 
        {
            JOptionPane.showMessageDialog(null, "Akun Anda Tidak Ditemukan");
        }    
    }      
}
