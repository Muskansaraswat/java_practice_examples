package java_practice.controlstatements;

import java.util.Scanner;

public class CalculatorSwitchStatements {
    public static void main(String[] args) {
        int num1, num2;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        num2 = sc.nextInt();
        System.out.println("Select operation from below\n +,-,*,/");
        choice=sc.next().charAt(0);
        switch(choice){
            case '+':
                System.out.println("The Addition of "+num1+" + "+num2+" is:"+(num1+num2));
                break;
            case '-':
                System.out.println("The Subtraction of "+num1+" - "+num2+" is:"+(num1-num2));
                break;
            case '*':
                System.out.println("The Multiplication  of "+num1+" * "+num2+" is:"+(num1*num2));
                break;
            case '/':
                System.out.println("The Division of "+num1+" / "+num2+" is:"+(num1/num2));
                break;
            default:
                System.out.println("Wrong Operation Selected");
        }

    }

}
