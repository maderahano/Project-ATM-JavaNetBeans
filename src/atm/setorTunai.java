/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class setorTunai
{
    mainMenu var;
    
    public setorTunai() {}
    
    public setorTunai(mainMenu data)
    {
        var = data;
    }
    
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
    
    public void info(mainMenu data)
    {
        var = data;
        int amount = 0;
        String s = JOptionPane.showInputDialog(null, "Input Jumlah Uang yang Ingin Anda Setor ");

        if (onlyContainsNumbers(s)) 
        {
            amount = Integer.parseInt(s);
            int tam = var.var1.getSaldo() + amount;
            var.var1.setSaldo(tam); 
            JOptionPane.showMessageDialog(null, "Setor Tunai Sukses.", "Setor Tunai ", JOptionPane.PLAIN_MESSAGE);
            int ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            // 0=yes ; 1=no
            if (ab == 0) 
            {
                JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nSetor Tunai: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                JOptionPane.showMessageDialog(null, "\nSetor Tunai: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
            }
        }else 
        {
            JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Setor Tunai", JOptionPane.ERROR_MESSAGE);
        }
    }       
}
