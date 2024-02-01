//creation of 2 d array
// n to search a key element
import java.util.*;
public class twodarray1{
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        //i/p
        System.out.println("enter the elements");
        Scanner s = new Scanner(System.in);
        for(int i=0; i<n ;i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        //o/p
        System.out.println("martix is");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key;
        System.out.println("enter element to be searched ");
        key = s.nextInt();
        search(matrix ,key);
    }
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.print("element found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
}