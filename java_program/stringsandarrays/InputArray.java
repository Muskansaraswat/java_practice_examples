package java_practice.stringsandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Enter number of elements you want in array :");
        int n=sc.nextInt();
        // array of primitives
        int[] arr=new int[n];
        System.out.println("Enter the value of elements in array :");
        for(int i=0;i<n;i++){//taking value of int array element by user input
            arr[i]=sc.nextInt();
        }
        */
        //array of objects
        String[] str=new String[4];
        //Initializing on all index manually
        /*
        str[0]="Anil";
        str[1]="Nitin";
        str[2]="Mukesh";
        str[3]="Ambani";
        */
        for(int i=0;i<str.length;i++){//taking value of String array element by user input
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        //Ways to print array elements
        /* 1. Using for loop with the help of index
         for(int i=0;i<n;i++){
            System.out.println("Value at arr["+i+"] :"+arr[i]);
         }
        */
        /* 2. Using for each loop - you can directly get the values without using indices
       /*
        for(int num : arr){// for every element in the array print the element
            System.out.println(num +" ");//here num represents element of the array
         }
        */
        /* 3. Using toString Method
        System.out.println(Arrays.toString(arr));
         */
    }
}
