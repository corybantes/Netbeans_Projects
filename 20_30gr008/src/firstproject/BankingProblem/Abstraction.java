/*
A bank has a problems with records of customer payments and need a system that helps with the format 
of the customer's name,account number and amount paid and displays it once it is needed for the day.
 */
package firstproject.BankingProblem;

import java.util.Scanner;
public class Abstraction {
   public static void main (String[] args){
       showPerson person1= new showPerson();
       person1.showdetails();
   } 
}

abstract class Person{
    public abstract void showdetails();
    
}

class showPerson extends Person{
    @Override
    public void showdetails(){
        String Name;
        String accountNumber;
        int amountPaid;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer's name");
        Name = input.nextLine();
        System.out.println("Enter customer's account number");
        accountNumber = input.nextLine();
        System.out.println("Enter the amount paid");
        amountPaid = input.nextInt();
        System.out.println("Name: "+Name+"\nAccount Number: "+accountNumber+"\nAmount Paid: "+amountPaid);
         
    }
}