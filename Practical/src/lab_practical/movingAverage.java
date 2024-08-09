package lab_practical;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;
public class movingAverage {
    public static void main(String[] args){
        int k=0,a=0;double d =0;
        String i ="" ;
        String[] InputNumber = new String[10];
        double[] ConvertNumber = new double[10];
        JTextArea output = new JTextArea(20,30);
        double[] NumberOutput = new double[10];
        DecimalFormat df = new DecimalFormat("0.00");
        while(a<1 || a>10){
            i = JOptionPane.showInputDialog(null, "How many names are in the array (1-10)");
            a = Integer.parseInt(i);
        }
        output.append("Number\tmovingAverage\n");
        for (k = 0;k < a;k++){
            InputNumber[k] = JOptionPane.showInputDialog(null, "Enter Text " +(k+1));
            ConvertNumber[k] = Double.parseDouble(InputNumber[k]);
            d = ConvertNumber[k] + d;
            NumberOutput[k] = d/(k+1);
            output.append(df.format(k+1)+"\t"+df.format(NumberOutput[k])+"\n");
        }
        JOptionPane.showMessageDialog(null, (output),"Text Output",1);
        System.exit(0);
    }
}
