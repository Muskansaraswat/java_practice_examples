package java_practice.basicprograms;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        radius = sc.nextInt();
        area = 3.14f * radius * radius;
        System.out.println("Area is "+ area);
    }
}
