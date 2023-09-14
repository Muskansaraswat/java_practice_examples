package java_practice.controlstatements;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the an integer:");
        num1 = sc.nextInt();
        switch (num1) {
            case 0:
                System.out.println("zero");
                break;
            default:
                //if we shift any positive number by 31 it gives zero
                switch (num1 >> 31) {
                    case 0:
                        System.out.println("positive");
                        break;
                    default:
                        System.out.println("negative");
                }
        }
    }
}
