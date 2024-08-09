/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixDeterminant;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class MatrixDeterminant {
    public static void main(String []args){
        TwoByTwo det2 = new TwoByTwo();
        det2.calc2x2();
        int [][] matrixC = {{3,6,3},{4,5,6},{1,5,9}};
        ThreeByThree det3x3 = new ThreeByThree();
        det3x3.setmatrixA(matrixC);
        det3x3.calc3x3();
        
    }
}

class ThreeByThree
{
    private int [][] matrixA = new int [3][3];
    public int getmatrixA(){
        return matrixA[3][3];
    }
    public void setmatrixA(int matrixA[][]){
        this.matrixA= matrixA;
    }
    
    int matrix;
    public void calc3x3(){
        matrix = (matrixA[0][0]*((matrixA[1][1]*matrixA[2][2])-(matrixA[1][2]*matrixA[2][1])))
        -(matrixA[0][1]*((matrixA[1][0]*matrixA[2][2])-(matrixA[1][2]*matrixA[2][0])))+
        (matrixA[0][2]*((matrixA[1][0]*matrixA[2][1])-(matrixA[1][1]*matrixA[2][0])));
        JOptionPane.showMessageDialog(null, "The determinant of the three by three matrix is " +matrix);
}
}
class TwoByTwo
{
    //int[][] matrixA =new int[2][2];
    /*private int matrixA[][];
    public int getmatrixA(){
        return matrixA[2][2];
    }
    public void setmatrixA(int mymatrixA[][]){
        matrixA = mymatrixA;
    }
    */
    int matrixA[][] ={{1,3},{2,1}};
    int  matrixB ;
    int matrixC;
    JTextArea output = new JTextArea(20,30);
    int matrix;
    
    public TwoByTwo(){}
    public void calc2x2(){
        int i=0;
        int j=0;
        int n=1;
        int m= 1;
        matrix = (matrixA[i][j] * matrixA[m][n])-(matrixA[i][n] * matrixA[m][j]);
        output.append("The Determinant is"+matrix);
        JOptionPane.showMessageDialog(null, output,"Determinant",1);
    }
}
class InputData
{
    int n;
    public InputData(){}
    public void input(){
        for(int i = 0;i <n;i++){
            for(int j= 0;j<n;j++){
                
            }
                }
    }
}