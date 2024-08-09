package firstproject;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;
public class quadraticEquation {
    public static void main(String[] args){
        double a , b , c;
        double determinant;
        DecimalFormat df = new DecimalFormat("0.0000");
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of b"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of c"));
        determinant = (b*b) - (4*a*c);
        
        if (determinant > 0){
            JOptionPane.showMessageDialog(null,"Root 1 is "+ df.format((-b + (Math.sqrt(determinant)))/2*a)+ "\n"
            + "Root 2 is "+ df.format((-b - (Math.sqrt(determinant)))/2*a));
        }
        if (determinant < 0) {
            JOptionPane.showMessageDialog(null,"Root 1 is "+(-b/2*a)+ "+"+ df.format((Math.sqrt(Math.abs(determinant)))/2*a) + "i"
            + "\n" + "Root 2 is "+(-b/2*a)+ "-"+ df.format((Math.sqrt(Math.abs(determinant)))/2*a) + "i") ;
        }
        System.exit(0);
    }
}
