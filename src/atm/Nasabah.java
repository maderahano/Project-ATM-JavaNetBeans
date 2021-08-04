/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author HP
 */
public class Nasabah 
{
    public String level = "",tanggal;
    public Object status;
    
    protected int nomorRekening1;
    protected String PIN1 = "", nama1 = "", login1 = "";
    
    private int nomorRekening, Saldo = 0;
    private String PIN = "", nama = "", login = "";
    
    public void setNomorRekening(int nomorRekening)
    {
        this.nomorRekening = nomorRekening;
    }
    
    public int getNomorRekening()
    {
        return this.nomorRekening;
    }
    
    public void setSaldo(int Saldo)
    {
        this.Saldo = Saldo;
    }
    
    public int getSaldo()
    {
        return this.Saldo;
    }
    
    public void setPIN(String PIN)
    {
        this.PIN = PIN;
    }
    
    public String getPIN()
    {
        return this.PIN;
    }
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public void setLogin(String login)
    {
        this.login = login;
    }
    
    public String getLogin()
    {
        return this.login;
    }
}


