/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureProblem;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class Inheritance {
    public static void main(String[] args){
        CalcAvg lab = new CalcAvg();
        lab.showdata();
    }
}
class AvgData
{
    int day; double sum=0;
    double inputTemp[] = new double[24];
    double average[] = new double[31];
    DecimalFormat df = new DecimalFormat("0.00");
    JTextArea output = new JTextArea(20,30);
    int hours ;
}
class CalcAvg extends AvgData
{
    public CalcAvg(){}
    public void showdata(){
        for (day = 0;day < 31;day++){
            for(hours=0;hours < 24;hours++){
                inputTemp[hours] = Double.parseDouble(JOptionPane.showInputDialog(
                        "Enter the temperature for day " +(day+1)+ " hour "+(hours+1)));
                sum = sum + inputTemp[hours];
            }
            average[day] = sum / 24;
            output.append(("Day "+(day+1) +"\t"+"Average hourly temperature "+
                    df.format(average[day])+"\n"));
            output.append("\n"); 
            sum = 0;       
        }
    JOptionPane.showMessageDialog(null, output, "Average Display",1);
    System.exit(0);
    }
}