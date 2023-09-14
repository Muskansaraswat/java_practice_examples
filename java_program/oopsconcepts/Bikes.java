package java_practice.oopsconcepts;

    public class Bikes{
        //creating a default constructor
       String bike_name;
       String bike_color;
        Bikes(String name,String clr){
            bike_name=name;
            bike_color=clr;
        }
        void display(){
            System.out.println(bike_name+" "+bike_color);
        }
        //main method
        public static void main(String args[]){
         //calling a default constructor
            Bikes b1=new Bikes("Yamaha","Blue");
            Bikes b2=new Bikes("R15","Orange");
            Bikes b3=new Bikes("Splendor","Black");
            Bikes b4=new Bikes("Royal Enfield","Red");
            System.out.println("Bikes are :");
            b1.display();
            b2.display();
            b3.display();
            b4.display();
        }
    }

