//Write a program to FindTransposeofa Matrix.
//What is Transpose?Transpose of a matrix is the process ofswapping therows to columns.
//For a 2x3 matrix,
// //Matrix
// a11    a12    a13
// a21    a22    a23
// Transposed Matrix
// a11    a21
// a12    a22
// a13    a23
import java.util.*;
public class twodarray7{
    public static void main(String args[]){
        int matrix[][] ={ {a11, a12, a13}, {a21, a22, a23} };
        System.out.println("Matrix ");
        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Transpose(matrix);
    }
    public static void Transpose(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix[i][j] = matrix[j][i];
            }
        }
        //to print
        System.out.println("transpose ");
        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
    }
}
}