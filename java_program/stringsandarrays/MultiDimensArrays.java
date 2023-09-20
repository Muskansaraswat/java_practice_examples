package java_practice.stringsandarrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensArrays {
    public static void main(String[] args) {
        int row,col;

        int[][] matrix={
                {1,2,3},// 0th index
                {4,5},//1st index
                {6,7,8,9}//2nd index
        };
        System.out.println("-----------------------");
        // in case column number is not fixed(variable)
        for(row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        int[][] arr=new int[3][3];//only number of row is enough to give
        //System.out.println(arr.length);//number of rows
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Values in 2D array");
        for(row = 0; row <3; row++){
            for (col = 0; col <3; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        // Priting 2D Array
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        //Priting 2D Array Using single loop
        for(row=0;row<3;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        //for-each enhanced loop
        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
