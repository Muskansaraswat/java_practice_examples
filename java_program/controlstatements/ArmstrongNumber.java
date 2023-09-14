package java_practice.controlstatements;

import java.util.Scanner;
//it is valid for three digits number
//basically armstrong number is when the sum of cube of every digit will be equal to the number itself known as armstrong number.

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input_number,single_digit,sum=0,original_number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three digit number");
        input_number=sc.nextInt();
        original_number=input_number;
        while(input_number!=0){
            single_digit=input_number%10;
            sum=sum+single_digit*single_digit*single_digit;
            input_number=input_number/10;
        }
        if(original_number==sum)
            System.out.println("Given number is a Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
