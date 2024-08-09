/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_practical;

import javax.swing.JOptionPane;
public class code2 {
    public static void main(String[] args){
        String name, age;
        name= JOptionPane.showInputDialog("Enter your name");
        age = JOptionPane.showInputDialog("Enter your age");
        JOptionPane.showMessageDialog(null, "Welcome "+name+"\nYou are "+age+
                " years old.");
        System.exit(0);
    }
}
