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
public class tarikTunaiCepat
{
    mainMenu var;
    
    public tarikTunaiCepat() {}
    
    public tarikTunaiCepat(mainMenu data)
    {
        var = data;
    }
    
    public void info(mainMenu data)
    {
        var = data;
        int ab;
        String[] s10 = {"50000", "100000", "200000", "300000", "500000", "750000", "1000000", ""};
        s10[7] = (String) JOptionPane.showInputDialog(null, "Pilih Tunai...", "Menu Penarikan Tunai", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);

        switch (s10[7]) 
        {
            case "50000":
                if (var.var1.getSaldo() > 50000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 50000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 50000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 50000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "100000":
                if (var.var1.getSaldo() > 100000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 100000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 100000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 100000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "200000":
                if (var.var1.getSaldo() > 200000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 200000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 200000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 200000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "300000":
                if (var.var1.getSaldo() > 300000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 300000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 300000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 300000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "500000":
                if (var.var1.getSaldo() > 500000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 500000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 500000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 500000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "750000":
                if (var.var1.getSaldo() > 750000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 750000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 750000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 750000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "1000000":
                if (var.var1.getSaldo() > 1000000 && var.var1.getSaldo() > 0) 
                {
                    int tarik = var.var1.getSaldo() - 1000000;
                    var.var1.setSaldo(tarik);
                    JOptionPane.showMessageDialog(null, "Uang Sukses Ditarik! ", "Informasi Akun", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nTarik Tunai: " + "Rp. 1000000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Information Akun", JOptionPane.INFORMATION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "\nTarik Tunai: " + "Rp. 1000000" + "\nSaldo: Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Anda Tidak Memiliki Saldo yang Cukup\nSaldo Sekarang : " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }    
}
