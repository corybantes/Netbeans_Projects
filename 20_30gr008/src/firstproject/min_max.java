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
public class min_max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        int[] set = {5,2,9,7,1};
        int temp = 0;
        System.out.println("Elements of original set:");
        for(int number:set){
            System.out.print(number+" ");
        }
        for(i = 0;i<set.length;i++){
            for(j = i+1;j<set.length;j++){
                if (set[i]>set[j]){
                    temp = set[i];
                    set[i] = set[j];
                    set[j] = temp;
                }
            }
        }
        System.out.println();
        
        System.out.println("Elements of setay sorted in ascending order:");
        for(int number:set){
            System.out.print(number + " ");
        }
    
        System.out.println();
        System.out.println("The minimum number of the set is " + set[0]);
        System.out.println("The maximum number of the set is " + set[set.length-1]);
    }
    
}
