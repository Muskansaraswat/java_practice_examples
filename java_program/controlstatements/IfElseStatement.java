package java_practice.controlstatements;

import java.util.Scanner;

//Such Statements which are used to control the flow of execution of other statements in our program are called as control statements.
//Control Statements ->
// Conditional branching -> if,if else,nested-if else,if else ladder
//Selection statement -> switch
//Looping -> for,while,do-while,for each
public class IfElseStatement {
    public static void main(String[] args) {
            int digit;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the your digit:");
            digit=sc.nextInt();
            if(digit%2==0){
                System.out.println("You Entered an Even Digit");
            }
            else {
                System.out.println("You Entered an Odd Digit");
            }
    }
}
