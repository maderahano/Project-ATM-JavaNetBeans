/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class pembayaranListrik extends pembayaranTagihan
{
    int tagihan=0, saldo=0 ,biayaAdmin=0;
    String tokenListrik;
    
    public pembayaranListrik(int biayaAdmin)
    {
        this.biayaAdmin = biayaAdmin;
    }
    
    public void setTokenListrik()
    {
        String s = JOptionPane.showInputDialog(null, "Input Token Listrik ");
        this.tokenListrik = s;
    }
    
    public void setBiaya()
    {
        String s = JOptionPane.showInputDialog(null, "Input Jumlah Tagihan Pembayaran yang Anda Dapat ");
        boolean angka = false;
        do
        {
            if (onlyContainsNumbers(s)) 
            {
                this.tagihan = Integer.parseInt(s);
                angka = true;
            }else
            {
                JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Pembayaran Macam-Macam", JOptionPane.ERROR_MESSAGE);
            }
        }while(!angka);
    }
    
    public int getBiaya()
    {
        return this.tagihan;
    }
    
    public int hasil(int saldo)
    {
        return saldo - tagihan - biayaAdmin;
    }    
}
