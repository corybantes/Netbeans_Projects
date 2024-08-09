package firstproject;

import java.util.Scanner;
public class m_n_rem {

    public static void main(String[] args) {
        int m,n;
        int i,j,a=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of m");
        m = input.nextInt();
        System.out.println("Enter the value of n");
        n = input.nextInt();
        for(i=1;i<m;i++){
            if (n%i==0){
                a++;
            }
        }
        System.out.println("The numbers that are divisible by n are "+a);
    }
    
}
