
package lab_practical;

import javax.swing.JOptionPane;

public class Rectangle {
 public static void main(String[] args){
     String firstinput,Secondinput;double Length;double breath;double Area;
     //open input dialogue box for first input
     firstinput=JOptionPane.showInputDialog("The length of the rectangle is");
     Length=Double.parseDouble(firstinput); //convert string input to double
     //open input dialogue box for Second input
     Secondinput=JOptionPane.showInputDialog("The breath of the rectangle is");
     breath=Double.parseDouble(Secondinput); //convert string input to double
     Area=Length*breath; //compute area of the rectangle
     JOptionPane.showMessageDialog(null, "The Area of the rectangle is"+
             " "+Area);
     System.exit(0);  
 }   
}
