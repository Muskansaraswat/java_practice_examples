package java_practice.basicprograms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base:");
        base=sc.nextDouble();
        System.out.println("Enter Height:");
        height=sc.nextDouble();
        area=0.5*base*height;
        System.out.println("Area of Triangle is : "+area);
    }
}
