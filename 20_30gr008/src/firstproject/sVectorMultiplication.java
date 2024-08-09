package firstproject;
import java.util.Scanner;
public class sVectorMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[][] = new int[1][3];
        int b[][] = new int[1][3];
        int c[][] = new int[1][3];
        String vector[] = {"i","j","k"};
        int i =0;
        while (i < 1){
            int j = 0;
            while (j<3){
                System.out.println("Enter the value of a"+vector[j]);
                a[i][j]= input.nextInt();
                System.out.println("Enter the value of b"+vector[j]);
                b[i][j] = input.nextInt();
                c[i][j] = a[i][j]*b[i][j];
                j++;
            }
            i++;
        }
        int k=0;
        while (k<1){
            int l=0;
            while(l<3){
                System.out.print(c[k][l]+vector[l]+"\t");
                l++;
            }
            k++;
        }
    }
}
