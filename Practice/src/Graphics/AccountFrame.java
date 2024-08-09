/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;
import javax.swing.*;
import java.awt.*;
public class AccountFrame extends JFrame{
    public static void main (String[] args){
        AccountFrame userAccount = new AccountFrame();
        userAccount.setVisible(true);
    }
    public AccountFrame(){
        setTitle("Customer Account");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        //JPanel panel2 = new JPanel();
        //panel1.setSize(200,200);
        JButton save = new JButton("Save Record");
        JButton discard = new JButton("Discard");
        panel1.setName("Account");
        //panel1.setBackground(Color.gray);
        JLabel id = new JLabel("Account Number");
        JTextField acctNumber = new JTextField(30);
        JLabel names = new JLabel("Customer Name");
        JTextField customerName =new JTextField(30);
        JLabel amount = new JLabel("Amount");
        JTextField Amount = new JTextField(30);
        panel1.add(id);
        panel1.add(acctNumber);
        panel1.add(names);
        panel1.add(customerName);
        panel1.add(amount);
        panel1.add(Amount);
        panel1.add(save);
        panel1.add(discard);
        add(panel1);
        //add(panel2);
        //pack();
    }
}
