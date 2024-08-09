/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author User
 */
public class PrimeNumbers {
    public static void main(String[]args){
        int temp=0;
        int primer=0;
        int prime[] = new int [50];
        for(int i = 2;i <100;i++){
            for(int j = 2;j<i;j++){
                if (i%j == 0){
                    temp++;
                    break;
                }
            }
            if (temp==0){
                prime[primer]=i;
                primer++;
            }
            
            temp =0;
        }
        for(int k = 0;k<primer;k++){
            System.out.print("\n"+prime[k]);
        }
    }
}
