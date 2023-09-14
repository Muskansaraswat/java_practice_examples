package java_practice.methods;

import java.util.Scanner;

public class GreatestNumberMethodOverloading {
    static int greatestNumber(int a,int b){
        if(a>b)
            return a;
        else return b;
    }
    static int greatestNumber(int a,int b,int c){
        if(a>b&&a>c)
            return a;
        else if(b>c)
            return b;
        else return c;
    }
    static int greatestNumber(int a,int b,int c,int d){
        if(a>b&&a>c&&a>d)
            return a;
        else if(b>c&&b>d)
            return b;
        else if(c>d)
            return c;
        else return c;
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers among find maximum 2, 3, 4");
        choice=sc.nextInt();
        if(choice==2){
            int num1,num2;
            System.out.println("Enter First Number");
            num1=sc.nextInt();
            System.out.println("Enter Second Number");
            num2=sc.nextInt();
            System.out.println("Maximum is "+greatestNumber(num1,num2));
        }
        else if(choice==3){
            int num1,num2,num3;
            System.out.println("Enter First Number");
            num1=sc.nextInt();
            System.out.println("Enter Second Number");
            num2=sc.nextInt();
            System.out.println("Enter Third Number");
            num3=sc.nextInt();
            System.out.println("Maximum is "+greatestNumber(num1,num2,num3));
        }
        else if(choice==4){
            int num1,num2,num3,num4;
            System.out.println("Enter First Number");
            num1=sc.nextInt();
            System.out.println("Enter Second Number");
            num2=sc.nextInt();
            System.out.println("Enter Third Number");
            num3=sc.nextInt();
            System.out.println("Enter Fourth Number");
            num4=sc.nextInt();
            System.out.println("Maximum is "+greatestNumber(num1,num2,num3,num4));
        }
        else{
            System.out.println("Enter a valid number");
        }
    }
}
