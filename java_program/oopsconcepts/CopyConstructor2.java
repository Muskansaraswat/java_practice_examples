package java_practice.oopsconcepts;

public class CopyConstructor2 {
    //We can copy the values of one object into another by assigning the objects values to another object.
    //In this case, there is no need to create the constructor.
    String fruit_name;
    String fruit_color;
    String fruit_taste;
    String fruit_shape;
    CopyConstructor2(){}
    CopyConstructor2(String name,String color,String taste,String shape){
        fruit_name=name;
        fruit_color=color;
        fruit_taste=taste;
        fruit_shape=shape;

    }
    void display(){
        System.out.println(fruit_name+" "+fruit_color+" "+fruit_taste+" "+" "+fruit_shape);
    }
}
class Fruits{
    public static void main(String[] args) {
        CopyConstructor2 fruit1=new CopyConstructor2("Apple","Red","Sweet","Round");
        CopyConstructor2 fruit2=new CopyConstructor2("Pineapple","Yellow","Sweet","Oval");
        CopyConstructor2 fruit3=new CopyConstructor2();
        fruit3.fruit_color="Pink";
        fruit3.fruit_name="Dragon Fruit";
        fruit3.fruit_taste=fruit2.fruit_taste;
        fruit3.fruit_shape=fruit2.fruit_shape;
        fruit1.display();
        fruit2.display();
        fruit3.display();

    }
}