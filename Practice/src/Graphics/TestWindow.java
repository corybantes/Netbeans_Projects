/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;
import javax.swing.*;
import java.awt.*;
public class TestWindow extends JWindow{
    public static void main(String[] args){
        TestWindow test = new TestWindow();
    }
    public TestWindow(){
        setBounds(300,250,300,300);
        setVisible(true);
    }
}
