package firstproject;
import javax.swing.JOptionPane;
public class percentageScore {     
    public static void main(String[] args) {
        int ca1,ca2,ca3;int exam;int attendance;int ass; double total; double percent;
        ca1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your score for the first continous assessment"));
        ca2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your score for the second continous assessment"));
        ca3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your score for the third continous assessment"));
        ass = Integer.parseInt(JOptionPane.showInputDialog("Enter your score for the class assignment"));
        attendance = Integer.parseInt(JOptionPane.showInputDialog("Enter your score for the attendance"));
        exam = Integer.parseInt(JOptionPane.showInputDialog("Enter your score for the examination"));
        total = ca1 + ca2 + ca3 + ass + attendance + exam ;
        percent = (total/300) * 100;
        JOptionPane.showMessageDialog(null, "Your percentage score is "+percent+"%");
        System.exit(0);
    }
    
}
