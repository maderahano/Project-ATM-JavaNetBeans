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
public class pembayaranInternet extends pembayaranTagihan
{
    int tagihan=0, saldo=0 ,biayaAdmin=0;
    String NoPelanggan;
    
    public pembayaranInternet(int biayaAdmin)
    {
        this.biayaAdmin = biayaAdmin;
    }
    
    public void setNomorPelanggan()
    {
        String s = JOptionPane.showInputDialog(null, "Input Nomor Pelanggan ");
        this.NoPelanggan = s;
    }
    
    public void setBiaya(int biaya)
    {
        this.tagihan = biaya;
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
