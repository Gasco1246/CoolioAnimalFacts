/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parrallelarrays;

/**
 *
 * @author gasco1246
 */
import java.io.*;
import javax.swing.*;
public class ParrallelArrays {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String input;
        String data = "";
        String data2 = "";
        boolean valid = false;
        boolean cont = true;
        int i;
        
        while(valid == false){
            try{
                FileReader file = new FileReader ("animals.dat");
                BufferedReader buffer = new BufferedReader(file);
                FileReader file2 = new FileReader ("keywords.dat");
                BufferedReader buffer2 = new BufferedReader(file2);
                
                
                
                i = 0;
                input = JOptionPane.showInputDialog("Enter search");
                while(cont&&i<=6){
                    
                    data = buffer.readLine();
                    data2 = buffer2.readLine();
                    
                    if(input.contains(data2)){
                        cont = false;
                    }
                    else{
                        i++;
                    }
                }
                
                System.out.println("Result: "+data);
                valid = true;
            }
            catch(Exception e){
                System.err.println(e);
                System.err.println("Hey man try that again. Not cool dude.  We do animal facts here, nothing else");
            }
        }
    }
}
