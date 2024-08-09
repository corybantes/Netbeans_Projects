package TemperatureConversion;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EnTempConversion {
    public static void main(String[]args){
        TemperatureConversion Data = new TemperatureConversion();
        try{
        Data.setchoice(Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for conversion from farenheit to celcius\n"
                + "Enter 2 for conversion from celcius to farenheit\nEnter 3 for conversion from farenheit to kelvin\n"
                + "Enter 4 for conversion from kelvin to farenheit\nEnter 5 for conversion from kelvin to celcius\n"
                + "Enter 6 for conversion from celcius to kelvin")));}
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Strings cannot be processed\n\n"+e.getMessage());;
        }
        Data.Conv();
    }
}
class TemperatureConversion
{
    double celcius,kelvin;
    double rankine,farenheit;
    DecimalFormat df= new DecimalFormat("0.000");
    JTextArea output= new JTextArea(20,30);
    //String input = JOptionPane.showInputDialog("Enter the conversion");
    //int choice = Integer.parseInt(input);
    
    private int choice;
    public int getchoice(){
        return choice;
    }
    public void setchoice(int mychoice){
        this.choice=mychoice;
    }
    
    public void Conv(){
    
        if(choice ==1){
            output.append("Farenheit\tCelcius\n");
            for(int temp = 0;temp<20;temp++){
                farenheit = 100*Math.random();
                celcius = (100*(farenheit-32))/180;
                output.append(df.format(farenheit)+"\t"+df.format(celcius)+"\n");
            }
        }
    
        if(choice==2){
            output.append("Celcius\tFarenheit\n");
            for(int temp = 0;temp<20;temp++){
                celcius = 100*Math.random();
                farenheit = ((180*(celcius-0))/100)+32;
                output.append(df.format(celcius)+"\t"+df.format(farenheit)+"\n");
            }
            JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
            System.exit(0);
           }
    
        if(choice==3){
        output.append("Farenheit\tKelvin\n");
        for(int temp = 0;temp<20;temp++){
            farenheit = 100*Math.random();
            kelvin = ((100*(farenheit-32))/180)+273;
            output.append(df.format(farenheit)+"\t"+df.format(kelvin)+"\n");
        }
        JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
        System.exit(0);
        }
        if(choice==4){
            output.append("Kelvin\tFarenheit\n");
            for(int temp = 0;temp<20;temp++){
                kelvin = 100*Math.random();
                farenheit = ((180*(kelvin-273))/100)+32;
                output.append(df.format(kelvin)+"\t"+df.format(farenheit)+"\n");
            }
            JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
            System.exit(0);
        }
        if(choice==5){
            output.append("Kelvin\tCelcius\n");
            for(int temp = 0;temp<20;temp++){
                kelvin = 100*Math.random();
                celcius = (100*(kelvin-273))/100;
                output.append(df.format(kelvin)+"\t"+df.format(celcius)+"\n");
            }
            JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
            System.exit(0);
        }
        if (choice==6){
            output.append("Celcius\tKelvin\n");
            for(int temp = 0;temp<20;temp++){
                celcius = 100*Math.random();
                kelvin = ((100*(celcius-0))/100)+273;
                output.append(df.format(celcius)+"\t"+df.format(kelvin)+"\n");
            }
            JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
            System.exit(0);
        }
    }
}
    