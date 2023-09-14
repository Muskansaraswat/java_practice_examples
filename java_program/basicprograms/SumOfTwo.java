package java_practice.basicprograms;
import  java.util.*;
public class SumOfTwo {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("the total is: "+sum);
    }
}
