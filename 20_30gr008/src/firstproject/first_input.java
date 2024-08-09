/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class first_input {
    public static void main(String[] args){
    Scanner myinput = new Scanner(System.in);
    int x,y,z,sum;
    System.out.println("Type 3 numbers :");
    x = myinput.nextInt();
    //
    y = myinput.nextInt();
    //
    z = myinput.nextInt();
    //
    sum=x+y+z;        
    System.out.println("The sum of "+x+","+y+"and "+z+" = "+sum);
      
    
    }
}
