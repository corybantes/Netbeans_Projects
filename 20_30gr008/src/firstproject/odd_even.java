/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;
import javax.swing.JOptionPane;

public class odd_even {

    public static void main(String[] args) {
       
        int entry;int even;int odd; int counter;
        even = 0;odd = 0;
        entry = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the set"));
        for(counter = 1;counter<=entry;counter++){
            int num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number "+(counter)));
            if (num %2 == 0){
                even ++;
            }
            else{
                odd ++;
            }}
        JOptionPane.showMessageDialog(null, "The number of the even numbers in the set is "+even+
                "\nThe number of the odd numbers in the set is "+odd);
        System.exit(0);
    }
    
}
