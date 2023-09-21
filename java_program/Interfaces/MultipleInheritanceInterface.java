package java_practice.Interfaces;

interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class MultipleInheritanceInterface implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("Overriding Printable Interface");
    }

    @Override
    public void show() {
        System.out.println("Overriding Showable Interface");
    }

    public static void main(String[] args) {
        MultipleInheritanceInterface m = new MultipleInheritanceInterface();
        m.show();
        m.print();
    }
}
