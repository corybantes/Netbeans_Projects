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

public class FibonacciSeries {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms for the fibonacci series ");
        n = input.nextInt();
        int []fib= new int [n];
        fib[0]=0;
        fib[1]=1;
        for(int i= 1;i<=n;i++){
            fib[i+1]=fib[i-1]+fib[i];
            System.out.print(fib[i]+"\n");
        }
        
    }
}
