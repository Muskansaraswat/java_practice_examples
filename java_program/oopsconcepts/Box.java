package java_practice.oopsconcepts;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
        message("Default Constructor");
    }
    //create a cube
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
        message("This is a cube");

    }

    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
        message("This is three arguements constructor");
    }
    Box(Box old){
        this.l= old.l;
        this.h= old.h;
        this.w= old.w;
        message("Copy Constructor");
    }
    public void message(String msg){
        System.out.println(msg);
    }
}
