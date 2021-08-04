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
public class pembayaranAir extends pembayaranTagihan
{
    int tagihan=0, saldo=0 ,biayaAdmin=0;
    String wilayah, NoPelanggan;
    
    public pembayaranAir(int biayaAdmin)
    {
        this.biayaAdmin = biayaAdmin;
    }
    
    public void setWilayah()
    {
        String[] s10 = {"Bali", "DKI Jakarta", "Jawa Barat", "Jawa Timur", "Jawa Tengah", ""};
        s10[5] = (String) JOptionPane.showInputDialog(null, "Pilih Pembayaran...", "Menu Wilaayah", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
        this.wilayah = s10[5];
    }
    
    public void setNomorPelanggan()
    {
        String s = JOptionPane.showInputDialog(null, "Input Nomor Pelanggan ");
        this.NoPelanggan = s;
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
