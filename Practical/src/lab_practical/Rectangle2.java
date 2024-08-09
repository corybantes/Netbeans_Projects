
package lab_practical;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Rectangle2 {
    public static void main(String[] args){
    DecimalFormat df=new DecimalFormat("0.0");
    JTextArea output = new JTextArea(20,10);
    String firstinput,secondinput; double Length;double breath;double Area;
    firstinput=JOptionPane.showInputDialog("The length of the rectangle is ");
    Length=Double.parseDouble(firstinput);
    secondinput=JOptionPane.showInputDialog("The breath of the rectangle is ");
    breath=Double.parseDouble(secondinput);
    Area = Length * breath;
    output.append(df.format(Area));
    JOptionPane.showMessageDialog(null,output,"Area of Rectangle",
        JOptionPane.PLAIN_MESSAGE);
    System.exit(0);
    }
}
