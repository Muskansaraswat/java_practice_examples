package java_practice.methods;

import java.util.Scanner;

public class ReturnWithoutArgs {
    //we are returning a String value with no parameters and taking name with user input and printing a message
    public static String display(){
        return "Hey";
    }

    public static void main(String[] args) {
        String name;
        System.out.println("May I Know Your Good Name");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println(display()+" "+name);
    }
}
