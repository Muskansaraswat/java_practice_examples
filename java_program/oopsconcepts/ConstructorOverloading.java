package java_practice.oopsconcepts;

public class ConstructorOverloading {
    int roll_number;
    String name;
    int age;
    ConstructorOverloading(int roll,String n){
        roll_number=roll;
        name=n;
    }
    ConstructorOverloading(int roll,String n,int ag){
        roll_number=roll;
        name=n;
        age=ag;
    }
    void show(){
        System.out.println(roll_number+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConstructorOverloading st1=new ConstructorOverloading(1,"Shiv",21);
        ConstructorOverloading st2=new ConstructorOverloading(2,"Shakti",15);
        ConstructorOverloading st3=new ConstructorOverloading(3,"Mahesh",16);
        ConstructorOverloading st4=new ConstructorOverloading(4,"Prem");
        st1.show();
        st2.show();
        st3.show();
        st4.show();
    }
}
