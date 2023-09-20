package java_practice.stringsandarrays;

import java.util.Arrays;

public class PassingArrayInFunction {

    public static void main(String[] args) {
        int[] age = {48,46,52,50};
        System.out.println(Arrays.toString(age));
        change(age);
        System.out.println(Arrays.toString(age));
    }

    static void change(int[] age){
        age[2]=46;
    }

}
