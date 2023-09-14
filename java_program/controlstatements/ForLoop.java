package java_practice.controlstatements;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,fact=1,i;
        num=sc.nextInt();
        for(i=2;i<=num;i++){
            fact=fact*i;

        }
        System.out.println("Factorial of "+num+" is :"+fact);
    }
}
