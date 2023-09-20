package java_practice.stringsandarrays;

import java.util.Arrays;

import static java_practice.stringsandarrays.SwappingArray.swap;
//by using Two pointer method approach
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={43,87,62,76,24};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
