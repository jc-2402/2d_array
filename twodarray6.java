//PRINT sum of 2nd row of num array
//Print out the sum of the numbers inthe second row of the “nums” array.Example :
//Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
import java.util.*;
public class twodarray6{
    public static void main(String args[]){
        int arr[][] ={ {1,4,9} ,{11,4,3}, {2,2,3}};
        int sum=0;
        for(int i=1 ; i<arr.length ;i++){
            for(int j=0; j<arr.length ; j++){
                if(i==1){
                    sum += arr[i][j]; 
                }
            }
        }
        System.out.println("sum of 2nd row elements : "+sum);
    }
}