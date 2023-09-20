package java_practice.stringsandarrays;

import java.util.Arrays;

public class PassingArrayInFunction {

    public static void main(String[] args) {
        //First Example
        int[] age = {48,46,52,50};
        System.out.print(Arrays.toString(age));
        change(age);
        System.out.print("\n"+Arrays.toString(age));
        System.out.println();
        //Second Example
        int[] arr = {21,45,62,78,94};
        incrementFunction(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }

    static void change(int[] age){
        age[2]=46;
    }
    static void incrementFunction(int[] argument){
        for(int i=0;i<argument.length;i++){
            System.out.print(argument[i]++ +" ");
        }
        System.out.println();
    }

}
