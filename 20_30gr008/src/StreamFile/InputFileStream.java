/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamFile;

import java.io.*;
public class InputFileStream {
    public static void main(String[]args){
        int data = 0;
        try{
        FileInputStream file1= new FileInputStream("C:\\Users\\User\\Downloads\\Series.txt");
        FileOutputStream outfile = new FileOutputStream("C:\\Users\\User\\Downloads\\filecopy.txt");
        while(data!=-1){
            data=file1.read();
            outfile.write((byte)data);
        }
        file1.close();outfile.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException ioe){
            ioe.getMessage();
        }
    }
}
