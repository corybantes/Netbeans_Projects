/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pat;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.io.*;
public class ArrangeNamesIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Name[] = new String [10];
        Scanner input = new Scanner(System.in);
        String temp = "";
        for(int i =0;i<10;i++){
            System.out.println("Enter Name"+(i+1));
            Name[i]= input.nextLine();
        }
        for(int k=0;k<9;k++){
            if(Name[k].compareTo(Name[k+1])>0){
                temp = Name[k];
                Name[k] = Name[k+1];
                Name[k+1] = temp;
                k = 0;
            }
        } 
        for(int j=0;j<10;j++){
            System.out.println(Name[j]+"\n");
        }
        try{
        FileOutputStream outfile = new FileOutputStream("C:\\Users\\User\\Desktop\\300 Notes\\Arrange.txt");
        BufferedOutputStream outbuff = new BufferedOutputStream(outfile);
        DataOutputStream outdata = new DataOutputStream(outbuff);
        PrintWriter out = new PrintWriter("C:\\Users\\User\\Desktop\\300 Notes\\Arrange.txt");
        for(int n = 0;n<10;n++){
            out.println(Name[n]);
        }
        outfile.close();
        out.close();
        }
        catch(FileNotFoundException ffe){
            System.out.println("File not found...\n"+ffe.toString());}
        catch(IOException ioe){
            System.out.println("Unable to read file...\n"+ioe.getMessage());
        }
    }
    
}
