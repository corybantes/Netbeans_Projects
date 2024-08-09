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
import java.io.*;
public class Threading {
    public static void main(String[]args){
        
    }
}

class one extends Thread
{
    @Override
    public void run()throws InterruptedExecution{
    for(int i =0;i<3;i++){
        System.out.println("This is batch 1 of computer engineering"+i);  
        Thread.sleep(1000);
    }
    }
}
class two extends Thread
{
    @Override
    public void run(){
    try{
    for(int i =0;i<4;i++){
        System.out.println("This is batch 1 of civil engineering"+i);  
        Thread.sleep(1000);
    }
    }
    catch(InterruptedExecution ie){
        
    }
    }
}