/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_practical;

import javax.swing.JOptionPane;
public class code3 {
    public static void main(String[] args){
        String firstinput,secondinput; int num1,num2,multiply;
        firstinput = JOptionPane.showInputDialog("Enter the first number");
        num1 = Integer.parseInt(firstinput);
        secondinput = JOptionPane.showInputDialog("Enter the second number");
        num2 = Integer.parseInt(secondinput);
        multiply = num1 * num2;
        JOptionPane.showMessageDialog(null, "The multiplication of the two numbers is "+multiply);
        System.exit(0);
    }
}
