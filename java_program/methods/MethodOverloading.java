package java_practice.methods;
//When a class has two or more methods by the same name but different parameters, it is known as method overloading.
public class MethodOverloading {
    static int sum(int a, int b) {
        System.out.println("int method is called");
        return a+b;
    }

    static float sum(float a, float b) {
        System.out.println("float method is called");
        return a+b;
    }

    static double sum(double a, double b) {
        System.out.println("Double method is called");
        return a+b;

    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(8578.4980,7856.643));
        System.out.println(sum(9.0f,8.5f));
    }
}