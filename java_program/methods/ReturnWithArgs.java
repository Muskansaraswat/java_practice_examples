package java_practice.methods;

import java.util.Scanner;

public class ReturnWithArgs {
    static int sum(int a,int b){
       return a+b;
    }

    public static void main(String[] args) {
        int num1,num2,choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times you want to perform addition: \n");
        choice=sc.nextInt();
        for(int i=1;i<=choice;i++){
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
            System.out.println("The sum of "+num1+" and "+num2+" is :"+sum(num1,num2));
        }
    }
}
