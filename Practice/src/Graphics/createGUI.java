/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;
import javax.swing.*;
import java.awt.*;
public class createGUI extends JFrame{
    public static void main(String[]args){
        createGUI first = new createGUI();
    }
    public createGUI(){
        Dimension Dim = new Dimension();
        Dim.height= 500;
        Dim.width= 500;
        setSize(Dim);
        setTitle("This is a Test Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
