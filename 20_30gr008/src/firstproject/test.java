package firstproject;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        int even,odd,temp1=0,temp2=0;
        double Average1,Average2;
        int sum1=0,sum2=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the lower number");
        int m = input.nextInt();
        System.out.println("Enter the value of the higher number");
        int n = input.nextInt();
        for(int i =m;i<=n;i++){
            if (i%2==0){
                even = i;
                sum1=sum1+even;
                temp1++;
            }
            if (i%2!=0){
                odd = i;
                sum2= sum2+odd;
                temp2++;
            }
        }
        Average1=sum1/temp1;
        Average2=sum2/temp2;
        System.out.println("The sum of the even numbers is "+sum1+"\n"+
        "The Average of the even numbers is "+Average1+"\n"+
                "The sum of the odd numbers is "+sum2+"\n"+
                "The Average of the odd numbers is "+Average2);
    }
}
