/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.io.*;
import java.util.*;
/**
 *
 * @author S209
 */
public class Aufgabe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scPnr = new Scanner(System.in);
        Scanner scKenz = new Scanner(System.in);
        String[] data = new String[20];
        String kenz = "";
        int pnr, i = 0;
        boolean exitInput = false;
        
        while(!exitInput)
        {
            try {
                
                System.out.print("Geben sie die Parkplatznummer ein:\t");
                pnr = scPnr.nextInt();;
                if (pnr == 0)
                {
                    exitInput = true;
                    txtSave(data);
                }
                else if (pnr < 10 || pnr > 29)
                {
                    System.out.println("Sie haben einen Parkplatz eingegeben der nicht innerhalb der Erlaubten liegt");
                }
                
                if(!exitInput)
                {
                    while(true){
                        System.out.print("Geben sie das Kennzeichen ein:\t");
                        kenz = scKenz.nextLine();
                        if (kenz != "")
                        {
                            break;
                        }
                    }
                }
                data[i] = pnr + "," + kenz;
                i++;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Der Parkplatz hat nur zahlen.");
                scPnr.next();
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                break;
            }
        }
    }
    
    
    public void txtSave(String[] pnr)
    {
        try
        {
            FileWriter fw = new FileWriter("C:\\Users\\S209\\Desktop\\platzdatei.txt",true);
            for (int i = 0; i < pnr.length; i++)
            {
                fw.write(pnr[i]+"\n");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
