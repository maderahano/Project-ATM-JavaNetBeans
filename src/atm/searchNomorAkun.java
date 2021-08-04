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
public class searchNomorAkun extends Akun
{
    List<Nasabah> user;

    public searchNomorAkun() {}
   
    public searchNomorAkun(List<Nasabah> user1)
    {
        user = user1;
    }
    
    public void info(List<Nasabah> user1)
    {
        user = user1;
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Input Nomor Akun yang Ingin Anda Temukan ", s2);
        boolean found = false;
        String[] columns = new String[]{"Nomor Akun", "Nama", "PIN", "Username", "Saldo", "Status", "Level", "Tanggal"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) 
        {
            Nasabah var = user.get(i);
            if (var.getNomorRekening() == Integer.parseInt(s1)) 
            {
                rows[0] = new Object[]{var.getNomorRekening(), var.getNama(), var.getPIN(), var.getLogin(), var.getSaldo(), var.status, var.level, var.tanggal};
                found = true;
            }
        }
        if (found) 
        {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) 
        {
            JOptionPane.showMessageDialog(null, "Tidak Ditemukan");
        }    
    }
}
