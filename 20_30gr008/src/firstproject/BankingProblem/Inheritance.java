/*
A bank has a problems with records of customer payments and need a system that helps with the format 
of the customer's name,account number and amount paid and displays it once it is needed for the day.
 */
package firstproject.BankingProblem;

import java.util.Scanner;
public class Inheritance {
    public static void main(String[] args){
        showperson client1 = new showperson() ;
        client1.showdata();
    }
}


class person
{
    String Name;
    String accountNumber;
    int amountPaid;
    Scanner input = new Scanner(System.in);
    public person(){}
}
class showperson extends person
{
    public void showdata(){
        System.out.println("Enter customer's name");
        Name = input.nextLine();
        System.out.println("Enter customer's account number");
        accountNumber = input.nextLine();
        System.out.println("Enter the amount paid");
        amountPaid = input.nextInt();
        System.out.println("Name: "+Name+"\nAccount Number: "+accountNumber+"\nAmount Paid: "+amountPaid);
    }
}