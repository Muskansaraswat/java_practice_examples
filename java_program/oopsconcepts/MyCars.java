package java_practice.oopsconcepts;

public class MyCars {
    public static void main(String[] args) {
        Cars c1=new Cars();
        c1.color="Red";
        c1.brand="Mahindra";
        c1.price=250000;
        c1.model_number="RJ318990";
        c1.properties();
        Cars c2=new Cars();
        c2.color="Black";
        c2.brand="Range Rover";
        c2.price=950000;
        c2.model_number="RJ120001";
        c2.properties();
    }
}
