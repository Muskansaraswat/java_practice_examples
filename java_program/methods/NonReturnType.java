package java_practice.methods;

public class NonReturnType {
    //writing a method which displays a message and has no return and no parameters.
    static public void printMessage(){
        System.out.print("This method does not return any value");
    }

    public static void main(String[] args) {
        //by creating object to access non-static method printMessage in static method
       // NonReturnType obj=new NonReturnType();
       // obj.printMessage();
        printMessage();
    }
}
