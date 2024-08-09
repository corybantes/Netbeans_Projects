package firstproject;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class VectorAddition {
    public static void main(String[] args){
        int i,j;
        int[][] a = new int[1][3];
        int[][] b = new int[1][3];
        int[][] c = new int[1][3];
        String[] vector= {"i","j","k"};
        JTextArea output = new JTextArea(10,10);
        for(i=0;i<1;i++){
            for(j=0;j<3;j++){
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the value for a"+vector[j]));
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the value for b"+vector[j]));
                c[i][j] = a[i][j] +b[i][j];
                output.append(c[i][j]+vector[j]+"\t");
            }
            
        }
        JOptionPane.showMessageDialog(null, output,"Vector Addition",1);
    }
}
