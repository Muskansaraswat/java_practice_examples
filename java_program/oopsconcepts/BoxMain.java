package java_practice.oopsconcepts;

public class BoxMain {
    public static void main(String[] args) {
        /*
        Box obj = new Box();
        System.out.println(obj.l+" "+obj.h+" "+obj.w);
        Box obj1 = new Box(44.9843);
        System.out.println(obj1.l+" "+obj1.h+" "+obj1.w);
        Box obj2 = new Box(22.3210,85.875,63.864);
        System.out.println(obj2.l+" "+obj2.h+" "+obj2.w);
        Box obj3= new Box(obj);
        System.out.println(obj3.l+" "+obj3.h+" "+obj3.w);
        */
        BoxWeight bw = new BoxWeight();
        System.out.println(bw.l+" "+ bw.h+" "+bw.w+" "+bw.weight);
        Box box= new BoxWeight();//you can't access the subclass variable with super class referencing variable.
        //System.out.println(box.l+" "+ box.h+" "+box.w+" "+box.weight);
        
    }
}
