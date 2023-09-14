package java_practice.controlstatements;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input_number,single_digit,reverse_order=0,original_number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        input_number=sc.nextInt();
        original_number=input_number;
        while(input_number!=0){
            single_digit=input_number%10;
            reverse_order=reverse_order*10+single_digit;
            input_number=input_number/10;
        }
        if(original_number==reverse_order)
            System.out.println("Given number is a Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
