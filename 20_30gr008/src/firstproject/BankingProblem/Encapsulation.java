/*
A bank has a problems with records of customer payments and need a system that helps with the format 
of the customer's name,account number and amount paid and displays it once it is needed for the day.
 */
package firstproject.BankingProblem;
import java.util.Scanner;
public class Encapsulation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Client client1 = new Client();
        System.out.println("Enter customer's name");
        client1.setName(input.nextLine());
        System.out.println("Enter customer's Account Number");
        client1.setaccountNumber(input.nextLine());
        System.out.println("Enter the Amount Paid");
        client1.setamountPaid(input.nextInt());
        client1.showdetails();
        System.out.println("Name: "+client1.getName()+"\nAccount Number: "+client1.getaccountNumber()+"\nAmount Paid: "+client1.getamountPaid());
    }
}

class Client
{
    private String Name;
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name= Name;
    }
    private String accountNumber;
    public String getaccountNumber(){
        return accountNumber;
    }
    public void setaccountNumber(String AccountNumber){
        accountNumber= AccountNumber;
    }
    private int amountPaid;
    public int getamountPaid(){
        return amountPaid;
    }
    public void setamountPaid(int AmountPaid){
        amountPaid = AmountPaid;
    }
    public void showdetails(){
        System.out.println("Name: "+Name+"\nAccount Number: "+accountNumber+"\nAmount Paid: "+amountPaid);
    }
}
