package java_practice.basicprograms;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch,cap;
        System.out.println("Enter Small Case Letter from a to z:");
        ch=sc.next().charAt(0);
        cap=(char)(ch-32);
        System.out.println("Capital Letter will be :"+cap);
    }
}
