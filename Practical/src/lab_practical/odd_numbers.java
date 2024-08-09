package lab_practical;
import javax.swing.JOptionPane;
public class odd_numbers {
    public static void main(String[] args) {
        int entry;int counter;int odd =0;
        int num;
        entry = 20;
        for (counter = 1;counter<= entry;counter++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter number "+counter));
            if (num%2 != 0){
                odd ++;
            }
        }
        JOptionPane.showMessageDialog(null, "The number of odd numbers in the set is "+odd);
    }
    
}
