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
public class letter_grade {
    public static void main(String[] args){
    Scanner myinput = new Scanner(System.in);
    int x;
    System.out.println("Enter your score:");
    x = myinput.nextInt();
    if (x>=70){
        System.out.println("Your grade is A");
    }
    if (x>=60 & x<70){
        System.out.println("Your grade is B");
    }
    if (x>=50 & x<60){
        System.out.println("Your grade is C");
    }
    if (x>=45 & x<50){
        System.out.println("Your grade is D");
    }
    if (x>=40 & x<45){
        System.out.println("Your grade is E");
    }
    if (x<40){
        System.out.println("Your grade is F");
    }
    
    }
    
}
