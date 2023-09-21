package java_practice.Abstraction;

abstract class Car {
    abstract void fuel_source();
    abstract void color();
    abstract void speed();
    abstract void price();
    void wheels(){
        System.out.println("Four wheeler");
    }
    void brakes(){
        System.out.println("Two Brakes");
    }

}
class HondaCity extends Car{

    @Override
    void fuel_source() {
        System.out.println("Petrol");
    }

    @Override
    void color() {
        System.out.println("Red");
    }

    @Override
    void speed() {
        System.out.println("170-180 kmph");
    }

    @Override
    void price() {
        System.out.println("Rs 14.80 lakh");
    }
}
class Tesla extends Car{

    @Override
    void fuel_source() {
        System.out.println("Electric");
    }

    @Override
    void color() {
        System.out.println("Black");
    }

    @Override
    void speed() {
        System.out.println("200-210 kmph");
    }

    @Override
    void price() {
        System.out.println("Rs 5 Crore");
    }
}
class Hyundai extends Car{

    @Override
    void fuel_source() {
        System.out.println("Diesel");
    }

    @Override
    void color() {
        System.out.println("White");
    }

    @Override
    void speed() {
        System.out.println("150-160 kmph");
    }

    @Override
    void price() {
        System.out.println("Rs 10 lakh");
    }
}
class TestDrive{
    public static void main(String[] args) {
        Car c;
        c = new HondaCity();
        System.out.println("Features of Honda City Car");
        c.fuel_source();
        c.color();
        c.speed();
        c.price();
        c.wheels();
        c.brakes();
        c = new Tesla();
        System.out.println("Features of Tesla Car");
        c.fuel_source();
        c.color();
        c.speed();
        c.price();
        c = new Hyundai();
        System.out.println("Features of Hyundai Car");
        c.fuel_source();
        c.color();
        c.speed();
        c.price();
    }

}