/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class transferBank
{
    mainMenu var;
    List<Nasabah> user;
    
    public transferBank() {}
    
    public transferBank(mainMenu data)
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
    
    public void info(mainMenu data, String a)
    {
        String auth = a;
        var = data;
        user = var.user1;
        int account1 = 0;
        int amount = 0, account = 0;
        String s = null;
        String[] s10 = {"Ke Bank Mandiri", "Ke Bank Lain Dalam Negeri", ""};
        s10[2] = (String) JOptionPane.showInputDialog(null, "Transfer Bank...", "Transfer Tunai", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
        if(auth == "Teller")
        {
            do 
            {
                if(s10[2] == "Ke Bank Mandiri")
                {
                    s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Transfer\nBatas Transfer : Rp. - ");
                    if (onlyContainsNumbers(s)) 
                    {
                        amount = Integer.parseInt(s);
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                    }
                } else if(s10[2] == "Ke Bank Lain Dalam Negeri")
                {
                    int biayaAdmin = 6500;
                    s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Transfer\nBatas Transfer : Rp. - ");
                    if (onlyContainsNumbers(s)) 
                    {
                        amount = Integer.parseInt(s) + biayaAdmin;
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } while (!onlyContainsNumbers(s));
            if (amount < var.var1.getSaldo()) 
            {
                String s1;
                do 
                {
                    s1 = JOptionPane.showInputDialog(null, "Input nomor rekening yang ingin Anda transfer: ");
                    if (onlyContainsNumbers(s1)) 
                    {
                        account = Integer.parseInt(s1);
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!onlyContainsNumbers(s1));
                if (account != var.var1.getNomorRekening()) 
                {
                    boolean found = false;
                    for (int i = 0; i < user.size(); i++) 
                    {
                        Nasabah var2 = user.get(i);
                        if (var2.getNomorRekening() == account) 
                        {
                            int ab = JOptionPane.showConfirmDialog(null, "Anda ingin Metransfer Tunai Sebesar Rp. " + amount + " di Rekening yang Dimiliki Oleh Bapak/Ibu " + var2.getNama(), "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                            // 0=yes ; 1=no
                            if (ab == 0) 
                            {
                                String s2;
                                do 
                                {
                                    s2 = JOptionPane.showInputDialog(null, "Mohon Inputkan kembali nomor rekening yang ingin Anda transfer: ");
                                    if (onlyContainsNumbers(s1)) 
                                    {
                                        account1 = Integer.parseInt(s2);
                                    } else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (!onlyContainsNumbers(s2));
                                if (account == account1) 
                                {
                                    int u1 = var2.getSaldo() + amount;
                                    var2.setSaldo(u1);
                                    int u2 = var.var1.getSaldo() - amount;
                                    var.var1.setSaldo(u2);
                                    JOptionPane.showMessageDialog(null, "Transaksi Dikonfirmasi.\n", "Transfer Tunai", JOptionPane.INFORMATION_MESSAGE);
                                    int ab1 = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Transfer Tunai", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                    // 0=yes ; 1=no
                                    if (ab1 == 0) 
                                    {
                                        if(s10[2] == "Ke Bank Mandiri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() +"\nDari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. -"+"\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        } else if(s10[2] == "Ke Bank Lain Dalam Negeri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() +"\nDari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. 6.500"+"\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nJumlah Transfer : Rp. " + amount + "\ngetSaldo() : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    } else
                                    {
                                        if(s10[2] == "Ke Bank Mandiri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Dari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. -"+"\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        } else if(s10[2] == "Ke Bank Lain Dalam Negeri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Dari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. 6.500"+"\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                }
                            }
                            found = true;
                        }
                    }
                    if (!found) 
                    {
                        JOptionPane.showMessageDialog(null, "Tidak Ditemukan", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Pilih akun lain selain akun ini", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                }
            } else 
            {
                JOptionPane.showMessageDialog(null, "Anda Tidak memiliki cukup uang untuk Transfer Tunai.\nSaldo Anda Saat Ini Adalah " + var.var1.getSaldo(), "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
            }        
        } else if(auth == "ATM")
        {
            do 
            {
                if(s10[2] == "Ke Bank Mandiri")
                {
                    if(var.var1.level == "Silver")
                    {
                        int maks = 25000000;
                        do
                        {
                            s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Transfer\nBatas Transfer : Rp. 25.000.000 ");
                            if (onlyContainsNumbers(s)) 
                            {
                                amount = Integer.parseInt(s);
                            } else 
                            {
                                JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                            if(amount > maks)
                            {
                                JOptionPane.showMessageDialog(null, "Anda Mentransfer Tunai Melebihi Rp. 25.000.000\nSilahkan Coba Lagi", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                        }while(amount > maks);
                    } else if(var.var1.level == "Gold")
                    {
                        int maks = 50000000;
                        do
                        {
                            s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Transfer\nBatas Transfer : Rp. 50.000.000 ");
                            if (onlyContainsNumbers(s)) 
                            {
                                amount = Integer.parseInt(s);
                            } else 
                            {
                                JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                            if(amount > maks)
                            {
                                JOptionPane.showMessageDialog(null, "Anda Mentransfer Tunai Melebihi Rp. 50.000.000\nSilahkan Coba Lagi", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                        }while(amount > maks);
                    }
                } else if(s10[2] == "Ke Bank Lain Dalam Negeri")
                {
                    if(var.var1.level == "Silver")
                    {
                        int maks = 10000000, biayaAdmin = 6500;
                        do
                        {
                            s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Transfer\nBatas Transfer : Rp. 10.000.000 ");
                            if (onlyContainsNumbers(s)) 
                            {
                                amount = Integer.parseInt(s) + biayaAdmin;
                            } else 
                            {
                                JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                            if(amount > maks)
                            {
                                JOptionPane.showMessageDialog(null, "Anda Mentransfer Tunai Melebihi Rp. 10.000.000\nSilahkan Coba Lagi", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                        }while(amount > maks);
                    } else if(var.var1.level == "Gold")
                    {
                        int maks = 25000000, biayaAdmin = 6500;
                        do
                        {
                            s = JOptionPane.showInputDialog(null, "Input Jumlah Tunai yang Ingin Anda Transfer\nBatas Transfer : Rp. 25.000.000 ");
                            if (onlyContainsNumbers(s)) 
                            {
                                amount = Integer.parseInt(s) + biayaAdmin;
                            } else 
                            {
                                JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                            if(amount > maks)
                            {
                                JOptionPane.showMessageDialog(null, "Anda Mentransfer Tunai Melebihi Rp. 25.000.000\nSilahkan Coba Lagi", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                            }
                        }while(amount > maks);
                    }
                }
            } while (!onlyContainsNumbers(s));
            if (amount < var.var1.getSaldo()) 
            {
                String s1;
                do 
                {
                    s1 = JOptionPane.showInputDialog(null, "Input nomor rekening yang ingin Anda transfer: ");
                    if (onlyContainsNumbers(s1)) 
                    {
                        account = Integer.parseInt(s1);
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!onlyContainsNumbers(s1));
                if (account != var.var1.getNomorRekening()) 
                {
                    boolean found = false;
                    for (int i = 0; i < user.size(); i++) 
                    {
                        Nasabah var2 = user.get(i);
                        if (var2.getNomorRekening() == account) 
                        {
                            int ab = JOptionPane.showConfirmDialog(null, "Anda ingin Metransfer Tunai Sebesar Rp. " + amount + " di Rekening yang Dimiliki Oleh Bapak/Ibu " + var2.getNama(), "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                            // 0=yes ; 1=no
                            if (ab == 0) 
                            {
                                String s2;
                                do 
                                {
                                    s2 = JOptionPane.showInputDialog(null, "Mohon Inputkan kembali nomor rekening yang ingin Anda transfer: ");
                                    if (onlyContainsNumbers(s1)) 
                                    {
                                        account1 = Integer.parseInt(s2);
                                    } else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Harap Masukkan Angka Saja..", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (!onlyContainsNumbers(s2));
                                if (account == account1) 
                                {
                                    int u1 = var2.getSaldo() + amount;
                                    var2.setSaldo(u1);
                                    int u2 = var.var1.getSaldo() - amount;
                                    var.var1.setSaldo(u2);
                                    JOptionPane.showMessageDialog(null, "Transaksi Dikonfirmasi.\n", "Transfer Tunai", JOptionPane.INFORMATION_MESSAGE);
                                    int ab1 = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Mencetak Bukti Transaksi?", "Transfer Tunai", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                    // 0=yes ; 1=no
                                    if (ab1 == 0) 
                                    {
                                        if(s10[2] == "Ke Bank Mandiri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() +"\nDari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. -"+"\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        } else if(s10[2] == "Ke Bank Lain Dalam Negeri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() +"\nDari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. 6.500"+"\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    } else
                                    {
                                        if(s10[2] == "Ke Bank Mandiri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Dari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. -"+"\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        } else if(s10[2] == "Ke Bank Lain Dalam Negeri")
                                        {
                                            JOptionPane.showMessageDialog(null, "Dari : "+var.var1.getNama()+"\nKepada : "+var2.getNama()+"\nBiaya Admin : Rp. 6.500"+"\nJumlah Transfer : Rp. " + amount + "\nSaldo : Rp. " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                }
                            }
                            found = true;
                        }
                    }
                    if (!found) 
                    {
                        JOptionPane.showMessageDialog(null, "Tidak Ditemukan", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Pilih akun lain selain akun ini", "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
                }
            } else 
            {
                JOptionPane.showMessageDialog(null, "Anda Tidak memiliki cukup uang untuk Transfer Tunai.\nSaldo Anda Saat Ini Adalah " + var.var1.getSaldo(), "Transfer Tunai", JOptionPane.ERROR_MESSAGE);
            }        
        }
    }    
}
