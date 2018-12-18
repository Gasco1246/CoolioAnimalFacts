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
import javax.swing.*;
public class ParrallelArrays {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        String animal[] = {"Bat","Whale","Kangaroo","David Attenborough","Cheetah","Sloth","Chicken"};
        String keyWord[] = {"fly","big","pouch","accent","fast","slow","salmonella"};
        
        
        boolean valid = false;
        boolean cont = true;
        int i;
        while(valid == false){
            try{
                
                i = 0;
                String input = JOptionPane.showInputDialog("Enter search");
                while(cont&&i<=6){
                    
                    if(input.contains(keyWord[i])){
                        cont = false;
                    }
                    else{
                        i++;
                    }
                }
                System.out.println("Result: "+animal[i]);
                valid = true;
            }
            catch(Exception e){
                System.err.println("Hey man try that again. Not cool dude.  We do animal facts here, nothing else");
            }
        }
    }
}
