package java_practice.Abstraction;

abstract class SimpleExample{
    void greeting(){
        System.out.println("Hi ,John Doe ! How are you ?");
    }
    public abstract void message();//A method which is declared as abstract and does not have implementation is known as an abstract method.


}
class Child extends SimpleExample{
    public void message(){
        System.out.println("What would you like to have ?");
    }
    public static void main(String[] args) {
      SimpleExample sm = new Child();//super class reference variable can store sub class object it will give no error
       sm.greeting();
       sm.message();
    }
}
