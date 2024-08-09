package firstproject;

import java.util.Scanner;
public class sVectorAddition {
    public static void main(String[] args){
        int i,j;
        int a[][] = new int[1][3];
        int b[][] = new int[1][3];
        int c[][] = new int[1][3];
        String vector[]={"i","j","k"};
        Scanner newinput = new Scanner(System.in);
        for(i=0;i<1;i++){
            for(j=0;j<3;j++){
                System.out.println("Enter the value of a"+vector[j]);
                a[i][j]=newinput.nextInt();
                System.out.println("Enter the value of b"+vector[j]);
                b[i][j]= newinput.nextInt();
                c[i][j] = a[i][j] + b[i][j];
                
            }
        }
        for(i=0;i<1;i++){
            for(j=0;j<3;j++){
                System.out.print(c[i][j]+vector[j]+"\t");
            }
        }
        newinput.close();
    }
}
