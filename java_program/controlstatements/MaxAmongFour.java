package java_practice.controlstatements;

import java.util.Scanner;

public class MaxAmongFour {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        num2 = sc.nextInt();
        System.out.println("Enter the num3:");
        num3 = sc.nextInt();
        System.out.println("Enter the num4:");
        num4 = sc.nextInt();
        if (num1 > num2) {
            if(num1>num3) {
                if (num1 > num4) {
                    System.out.println(num1);
                }
            }
        }
        else if(num2>num3){
            if(num2>num4){
                System.out.println(num2);
            }
        }
        else if(num3>num4){
            System.out.println(num3);
        }
        else{
            System.out.println(num4);
        }

        /*
        //simple approach
        if(b>a){
            a=b;
        }
        if(c>a){
            a=c;
        }
        if(d>a){
            a=d;
        }
        System.out.println("max is"+a);

         */
    }
}