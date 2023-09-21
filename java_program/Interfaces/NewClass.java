package java_practice.Interfaces;
interface  printable{
    void print();
}
public class NewClass  implements printable{

    @Override
    public void print() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        NewClass nw = new NewClass();
        nw.print();
    }
}
