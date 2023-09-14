package java_practice.controlstatements;
import java.util.Scanner;
public class IfElseIfLadder {
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        a=sc.nextInt();
        System.out.println("Enter the second value");
        b=sc.nextInt();
        System.out.println("Enter the third value");
        c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a);
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }
}
