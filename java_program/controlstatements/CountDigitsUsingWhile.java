package java_practice.controlstatements;

import java.util.Scanner;

public class CountDigitsUsingWhile {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        n=sc.nextInt();

        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println("The number have "+count+" digits");

    }

}
/*
public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Integer Number");
        n=sc.nextInt();
        int original_value=n;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of "+original_value+" digits is "+sum);

    }

}*/
