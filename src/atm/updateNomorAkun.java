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
public class updateNomorAkun extends Akun
{
    List<Nasabah> user;

    public updateNomorAkun() {}
   
    public updateNomorAkun(List<Nasabah> user1)
    {
        user = user1;
    }
    
    public void info(List<Nasabah> user1)
    {
        user = user1;
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Input Nomor Akun yang Ingin Anda Update ", s2);
        boolean found = false;
        String[] columns = new String[]{"Nomor Akun", "Nama", "PIN", "Username", "Saldo", "Status", "Level", "Tanggal"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) 
        {
            Nasabah var = user.get(i);
            if (var.getNomorRekening() == Integer.parseInt(s1)) 
            {
                rows[0] = new Object[]{var.getNomorRekening(), var.getNama(), var.getPIN(), var.getLogin(), var.getSaldo(), var.status, var.level, var.tanggal};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                String[] s0 = {"Silver", "Gold"};
                String[] s01 = {"Active", "Deactive"};
                String s = "";
                String ab = "";
                var.login1 = JOptionPane.showInputDialog("Enter Username", ab);
                if (var.login1.equals("")) 
                {
                    String log = var.getLogin();
                    var.setLogin(log); 

                } else 
                {
                    String log = var.login1;
                    var.setLogin(log); 
                }
                do 
                {
                    var.nama1 = JOptionPane.showInputDialog("Input Nama", s);
                    if (var.nama1.equals("")) 
                    {
                        String nm = var.getNama();
                        var.setNama(nm); 
                        break;
                    }
                    if (var.nama1.matches("[a-zA-Z]+")) 
                    {
                        String nm = var.nama1;
                        var.setNama(nm); 
                        break;
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Nama yang Anda Input Invalid ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!var.nama1.matches("[a-zA-Z]+"));
                String s11 = "";

                do 
                {
                    var.PIN1 = JOptionPane.showInputDialog("Input 5 Digit Kode PIN", s11);
                    if (var.PIN1.matches("[0-9]{5}")) 
                    {
                        String p = var.PIN1; 
                        var.setPIN(p); 
                        break;
                    }
                    if (var.PIN1.equals("")) 
                    {
                        String p = var.getPIN();
                        var.setPIN(p); 
                        break;
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Mohon Input 5 Digit Kode PIN ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!var.PIN1.matches("[0-9]{5}"));
                var.status = (String) JOptionPane.showInputDialog(null, "Pilih Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                var.level = (String) JOptionPane.showInputDialog(null, "Pilih Level...", "Level", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                JOptionPane.showMessageDialog(null, "Akun Anda Sukses di-Update... ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                String[] columnss = new String[]{"Nomor Akun", "Nama", "PIN", "Username", "Saldo", "Status", "Level", "Tanggal"};
                Object[][] rowss = new Object[1][columnss.length];
                rowss[0] = new Object[]{var.getNomorRekening(), var.getNama(), var.getPIN(), var.getLogin(), var.getSaldo(), var.status, var.level, var.tanggal};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                found = true;
            }
        }
        if (!found) 
        {
            JOptionPane.showMessageDialog(null, "Akun Anda Tidak Ditemukan");
        }    
    }    
}
