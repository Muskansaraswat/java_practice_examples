package java_practice.controlstatements;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,m,reverse_order=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        n=sc.nextInt();

        while(n!=0){
            m=n%10;
            reverse_order=reverse_order*10+m;
            n=n/10;
        }
        System.out.println("After reversing "+reverse_order);

    }
}
