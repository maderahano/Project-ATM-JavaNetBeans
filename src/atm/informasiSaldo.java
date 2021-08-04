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
public class informasiSaldo 
{
    mainMenu var;
    
    public informasiSaldo() {}
    
    public informasiSaldo(mainMenu data)
    {
        var = data;
    }
    
    public void info(mainMenu data) 
    {
        var = data;
        JOptionPane.showMessageDialog(null, "Akun #" + var.var1.getNomorRekening() + "\nTanggal: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nSaldo: " + var.var1.getSaldo(), "Informasi Akun", JOptionPane.INFORMATION_MESSAGE);
    }   
}
