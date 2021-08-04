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
public class pembayaranTagihan
{
    mainMenu var;
    
    public pembayaranTagihan() {}
    
    public pembayaranTagihan(mainMenu data)
    {
        var = data;
    }
    
    protected boolean onlyContainsNumbers(String text) 
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
        int ab, amount = 0;
        String[] s10 = {"Listrik", "Air PDAM", "Internet & TV Kabel", "Pulsa", ""};
        s10[4] = (String) JOptionPane.showInputDialog(null, "Pilih Pembayaran...", "Menu Pembayaran", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
            switch (s10[4]) 
            {
                case "Listrik":
                    pembayaranListrik listrik = new pembayaranListrik(2000);
                    listrik.setTokenListrik(); listrik.setBiaya();
                    amount = listrik.getBiaya();
                    if (var.var1.getSaldo() > amount + 2000 && var.var1.getSaldo() > 0) 
                    {
                        int pem = listrik.hasil(var.var1.getSaldo());
                        var.var1.setSaldo(pem); 
                        JOptionPane.showMessageDialog(null, "Tagihan Sukses Dibayar! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                        ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        // 0=yes ; 1=no
                        if (ab == 0) 
                        {
                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) +"\nBiaya Admin : Rp. 2.000"+"\nTagihan: " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Biaya Admin : Rp. 2.000"+"\nTagihan: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Air PDAM":
                    pembayaranAir air = new pembayaranAir(2000);
                    air.setWilayah(); air.setNomorPelanggan(); air.setBiaya();
                    amount = air.getBiaya();
                    if (var.var1.getSaldo() > amount + 2000 && var.var1.getSaldo() > 0) 
                    {
                        int pem = air.hasil(var.var1.getSaldo());
                        var.var1.setSaldo(pem); 
                        JOptionPane.showMessageDialog(null, "Tagihan Sukses Dibayar! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                        ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        // 0=yes ; 1=no
                        if (ab == 0) 
                        {
                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) +"\nBiaya Admin : Rp. 2.000"+ "\nTagihan: " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Biaya Admin : Rp. 2.000"+"\nTagihan: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Internet & TV Kabel":
                    pembayaranInternet internet = new pembayaranInternet(2000);
                    internet.setNomorPelanggan(); internet.setBiaya(850000);
                    amount = internet.getBiaya();
                    if (var.var1.getSaldo() > amount + 2000 && var.var1.getSaldo() > 0) 
                    {
                        int pem = internet.hasil(var.var1.getSaldo());
                        var.var1.setSaldo(pem); 
                        JOptionPane.showMessageDialog(null, "Tagihan Sukses Dibayar! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                        ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        // 0=yes ; 1=no
                        if (ab == 0) 
                        {
                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) +"\nBiaya Admin : Rp. 2.000"+ "\nTagihan: " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Biaya Admin : Rp. 2.000"+"\nTagihan: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Pulsa":
                    pembayaranPulsa pulsa = new pembayaranPulsa(500);
                    pulsa.setNomorHP(); pulsa.setBiaya();
                    amount = pulsa.getBiaya();                   
                    if (var.var1.getSaldo() > amount + 500 && var.var1.getSaldo() > 0) 
                    {
                        int pem = pulsa.hasil(var.var1.getSaldo());
                        var.var1.setSaldo(pem); 
                        JOptionPane.showMessageDialog(null, "Tagihan Sukses Dibayar! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                        ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        // 0=yes ; 1=no
                        if (ab == 0) 
                        {
                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) +"\nBiaya Admin : Rp. 500"+ "\nTagihan: " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Biaya Admin : Rp. 500"+"\nTagihan: Rp. " + amount + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
    }    
}
