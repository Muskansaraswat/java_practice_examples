package java_practice.Interfaces;
interface Drawable{
    void draw();
}
class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Square implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
class Shape {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.draw();
    }
}