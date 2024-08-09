/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author User
 */
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class ExceptionTest {
    public static void main(String[]args){
        JTextArea output = new JTextArea(20,30);
        int k=0;int c=0;
        String i="";
        String[] text = new String[10];
        try{
                i = JOptionPane.showInputDialog(null,"Enter the size of the array (1-10)");
                c = Integer.parseInt(i);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Invalid Data Entered ...."+nfe.getMessage());
            System.exit(1);
        }
        for(;k<c;k++){
            text[k] = JOptionPane.showInputDialog(null, "Enter Text "+(k+1));
            output.append((k+1)+"\t"+text[k]+"\n");
            
        }
        JOptionPane.showMessageDialog(null,output, "Text Output",1);
        System.exit(0);
    }
}
