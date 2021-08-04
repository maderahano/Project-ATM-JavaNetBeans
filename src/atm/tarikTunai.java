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
public class tarikTunai
{
    mainMenu var;
    
    public tarikTunai() {}
    
    public tarikTunai(mainMenu data)
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
        String s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Tarik ");
        if (onlyContainsNumbers(s)) 
        {
            amount = Integer.parseInt(s);
         
            if (amount >= 50000 && amount < var.var1.getSaldo()) 
            {
                int u1 = var.var1.getSaldo() - amount;
                var.var1.setSaldo(u1);
                JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);
                int ab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                // 0=yes ; 1=no
                if (ab == 0) 
                {
                    JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                }else
                {
                    JOptionPane.showMessageDialog(null, "\nTarik Tunai: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                }
            } else 
            {
                JOptionPane.showMessageDialog(null, "Anda tidak Bisa menarik Kurang dari Rp. 50.000 ", "Informasi Akun", JOptionPane.ERROR_MESSAGE);
            }
        }else 
        {
            JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Tarik Tunai", JOptionPane.ERROR_MESSAGE);
        }
    }
}
