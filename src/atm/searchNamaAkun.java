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
public class searchNamaAkun extends Akun
{
    List<Nasabah> user;

    public searchNamaAkun() {}
   
    public searchNamaAkun(List<Nasabah> user1)
    {
        user = user1;
    }
    
    public void info(List<Nasabah> user1)
    {
        user = user1;
        String s11 = "",s12 = "";
        s11 = JOptionPane.showInputDialog("Innput Nama Akun yang Ingin Anda Temukan ", s12);
        boolean found = false;
        String[] columns = new String[]{"Nomor Akun", "Nama", "PIN", "Username", "Saldo", "Status", "Level", "Tanggal"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) 
        {
            Nasabah var = user.get(i);
            if (var.getNama().equals(s11)) 
            {
                rows[i] = new Object[]{var.getNomorRekening(), var.getNama(), var.getPIN(), var.getLogin(), var.getSaldo(), var.status, var.level, var.tanggal};
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
