//spiral matrix
import java.util.*;
public class twodarray2{
    public static void printSpiral(int matrix[][]){
        int startrow =0;
        int startcol =0;
        int endrow = matrix.length -1;
        int endcol = matrix[0].length -1;
        while( startrow<= endrow && startcol <= endcol){
            //top (1,2,3,4) 
            for(int j=startcol; j<=endcol ; j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right (8,12,16)
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom(15,14,13)
            for(int j= endcol-1; j>=startcol ; j--){
                if(startrow ==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1; i>=startrow; i--){
                if(startcol==endcol)
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String args[]){
        int matrix[][] ={ {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};
        printSpiral(matrix);
    }
}