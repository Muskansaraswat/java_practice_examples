package java_practice.controlstatements;

import java.util.Scanner;

public class CountEvenDigitsInNumber {
        public static void main(String[] args) {
            int n,count=0,d=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Integer Number");
            n=sc.nextInt();
            int original_value=n;
            while(n!=0){
                d=n%10;
                if(d%2==0){
                    count++;
                }
                n=n/10;
            }
            System.out.println("Number of even digits  in "+original_value+" digits is "+count);

        }


}
