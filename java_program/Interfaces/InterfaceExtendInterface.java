package java_practice.Interfaces;
interface Runnable{
    public abstract void run();
}
interface Writable extends Runnable{
    void show();
}
public class InterfaceExtendInterface implements Writable{

    @Override
    public void run() {
        System.out.println("Running Runnable Interface");
    }

    @Override
    public void show() {
        System.out.println("Running Writable Interface");
    }

    public static void main(String[] args) {
        Writable sh = new InterfaceExtendInterface();
        sh.run();
        sh.show();
    }
}
