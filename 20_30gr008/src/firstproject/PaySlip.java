/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class PaySlip{
    public static void main (String[]args){
        int st = 0;
        String i = "";
        JTextArea slip = new JTextArea(10,10);
        DecimalFormat df = new DecimalFormat("0.00");
        double income = 0;
        while(st<1||st>3){
            i = JOptionPane.showInputDialog(null,"Enter Employees Status(1-3)");
            st = Integer.parseInt(i);
        }
        switch (st)
        {
            case 1:
                executive staffer1= new executive();
                slip = staffer1.getData(st);
                income = staffer1.computeIncome();
                slip.append("\n\nNet Income ="+df.format(income));
                staffer1.printPaySlip(slip);
                break;
            case 2:
                manager staffer2= new manager();
                slip = staffer2.getData(st);
                income = staffer2.computeIncome();
                slip.append("\n\nNet Income ="+df.format(income));
                staffer2.printPaySlip(slip);
                break;
            case 3:
                tempWorker staffer3= new tempWorker();
                slip = staffer3.getData(st);
                income = staffer3.computeIncome();
                slip.append("\n\nNet Income ="+df.format(income));
                staffer3.printPaySlip(slip);
                break;
        }
    }
}


class DoPaySlip {
    
        // TODO code application logic here
        protected String employeeID = "";
        protected String employeeName = "";
        protected int status = 0;
        protected double grossPay= 0;
        
        public JTextArea getData(int s){
            status= s;
            JTextArea payslip = new JTextArea(10,10);
            employeeID = JOptionPane.showInputDialog(null, "Enter Employee's ID");
            payslip.append("Employee ID:\t"+employeeID);
            employeeName = JOptionPane.showInputDialog(null, "Enter Employee's Name");
            payslip.append("\n\nEmployee Name:\t"+employeeName);
            String input= JOptionPane.showInputDialog(null, "Enter Employee's Gross Pay");
            grossPay = Double.parseDouble(input);
            
            if (status ==1){input="Executive";}
            if (status==2){input = "Manager";}
            if (status == 3){input = "Temp Worker";}
            payslip.append("\n\nEmployee Status:\t"+input);
            return payslip;
        }
        
        public void printPaySlip(JTextArea ps){
            JOptionPane.showMessageDialog(null, ps,"Pay Slip",1);
        }
    
    
    
}

interface workForce{
    public abstract double computeIncome();
}

class executive extends DoPaySlip implements workForce{
    @Override
    public double computeIncome(){
        double allowance = 120000.00;
        double deductions = 1500.00;
        double taxRate = 0.20;
        double income =0;
        income = (super.grossPay+allowance)*taxRate-deductions;
        return income;
    }
    public executive(){}
}

class manager extends DoPaySlip implements workForce{
    @Override
    public double computeIncome(){
        double allowance = 80000.00;
        double deductions = 1200.00;
        double taxRate = 0.15;
        double income =0;
        income = (super.grossPay+allowance)*taxRate-deductions;
        return income;
    }
    public manager(){}
}

class tempWorker extends DoPaySlip implements workForce{
    @Override
    public double computeIncome(){
        double allowance = 10000.00;
        double deductions = 100.00;
        double taxRate = 0.05;
        double income =0;
        income = (super.grossPay+allowance)*taxRate-deductions;
        return income;
    }
    public tempWorker(){}
}