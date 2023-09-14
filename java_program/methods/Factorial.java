package java_practice.methods;

import java.util.Scanner;

public class Factorial {
    public static int fact(int x){
          if(x==0||x==1){
              return 1;
          }
          else{
             return(x*fact(x-1));
          }

    }

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        int result= fact(num);
        System.out.println("Factorial of "+num+" is : "+result);
    }
}
