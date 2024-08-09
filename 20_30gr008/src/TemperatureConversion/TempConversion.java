/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConversion;

import java.text.DecimalFormat;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class TempConversion {
    public static void main(String[]args){
        Conversion Thermo=new Conversion();
        Thermo.celciusToFarenheit();
        Thermo.celciusToKelvin();
    }
}
class ConversionData
{
    double celcius,kelvin;
    double rankine,farenheit;
    DecimalFormat df= new DecimalFormat("0.000");
    JTextArea output= new JTextArea(20,30);
}
class Conversion extends ConversionData
{
    public void farenheitToCelcius(){
        output.append("Farenheit\tCelcius\n");
        for(int temp = 0;temp<20;temp++){
            farenheit = 100*Math.random();
            celcius = (100*(farenheit-32))/180;
            output.append(df.format(farenheit)+"\t"+df.format(celcius)+"\n");
        }
        JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
        System.exit(0);
    }
    public void celciusToFarenheit(){
        output.append("Celcius\tFarenheit\n");
        for(int temp = 0;temp<20;temp++){
            celcius = 100*Math.random();
            farenheit = ((180*(celcius-0))/100)+32;
            output.append(df.format(celcius)+"\t"+df.format(farenheit)+"\n");
        }
        JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
        System.exit(0);
    }
    public void farenheitToKelvin(){
        output.append("Farenheit\tKelvin\n");
        for(int temp = 0;temp<20;temp++){
            farenheit = 100*Math.random();
            kelvin = ((100*(farenheit-32))/180)+273;
            output.append(df.format(farenheit)+"\t"+df.format(kelvin)+"\n");
        }
        JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
        System.exit(0);
    }
    public void kelvinToFarenheit(){
        output.append("Kelvin\tFarenheit\n");
        for(int temp = 0;temp<20;temp++){
            kelvin = 100*Math.random();
            farenheit = ((180*(kelvin-273))/100)+32;
            output.append(df.format(kelvin)+"\t"+df.format(farenheit)+"\n");
        }
        JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
        System.exit(0);
    }
    public void kelvinToCelcius(){
        output.append("Kelvin\tCelcius\n");
        for(int temp = 0;temp<20;temp++){
            kelvin = 100*Math.random();
            celcius = (100*(kelvin-273))/100;
            output.append(df.format(kelvin)+"\t"+df.format(celcius)+"\n");
        }
        JOptionPane.showMessageDialog(null,output,"Temperature Conversion",1);
        System.exit(0);
    }
    public void celciusToKelvin(){
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