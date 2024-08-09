package firstproject;

import javax.swing.JOptionPane;

public class cgpaCalc {
    public static void main(String[] args){
        int g1 = 0,g21 = 0,g22 =0,g3 = 0,gpass=0;
        int counter, entry;
        double cgpa;
        entry = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students"));
        for(counter=1;counter<=entry;counter++){
            cgpa = Double.parseDouble(JOptionPane.showInputDialog("Enter the cgpa of student "+ counter));
            if(cgpa >= 4.5 & cgpa < 5.0){
                g1++;
            }
            else{
                if (cgpa >= 3.5){
                    g21++;
                }
                else if (cgpa >= 2.5){
                    g22++;
                }
                else if (cgpa >= 1.5){
                    g3++;
                }
                else if (cgpa >= 1.0){
                    gpass++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "The number of students with first class are " +g1+
                "\nThe number of students with second class upper is "+g21+
                "\nThe number of students with second class lower is "+g22+
                "\nThe number of students with third class is "+g3+
                "\nThe number of students with pass is "+gpass);
        System.exit(0);
    }
}
