package java_practice.Abstraction;
//An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
abstract class Bike {
    abstract void model();
    Bike(){
        this(2);
        System.out.println("Bike default Constructor is called");
    }
    Bike(int wheels){
        System.out.println("2 wheeler");
    }
    void changeGear(){
        System.out.println("Gear Changed");
    }
}
class Honda extends Bike{
    Honda(){
        System.out.println("Honda default Constructor is Called");
    }

    @Override
    void model() {
        System.out.println("Honda Shine");
    }

    public static void main(String[] args) {
        Bike bike1 = new Honda();
        bike1.model();
        bike1.changeGear();
    }
}