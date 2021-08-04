/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Asus
 */
public class main 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {      
        Loading loading = new Loading();
        loading.setVisible(true);
        loading.setLocationRelativeTo(null);
        
        try
        {
            for(int i = 0; i<=100; i++)
            {
               Thread.sleep(50);
               loading.progressno.setText(Integer.toString(i)+"%");
               loading.progressbar.setValue(i);
               if(i==100)
               {
                    loading.setVisible(false);
                    mainMenu menu = new mainMenu();
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(null);
               }
            }
        }catch(InterruptedException e)
        {
        
        }
    }  
}
