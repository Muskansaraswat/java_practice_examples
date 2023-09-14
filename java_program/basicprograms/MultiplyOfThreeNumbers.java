package java_practice.basicprograms;
import java.util.Scanner;

public class MultiplyOfThreeNumbers {
    public static void main(String[] args) {
        int num1,num2,num3,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        System.out.println("Enter the third number:");
        num3=sc.nextInt();
        result=num1*num2*num3;
        System.out.println("The multiply of "+num1+" * "+num2+" * "+num3+" is: "+result);
    }
}
