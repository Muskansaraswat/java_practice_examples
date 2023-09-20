package java_practice.stringsandarrays;

import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int[] arr= {12,24,36,64,80};
        System.out.println("Before Swapping :"+Arrays.toString(arr));
        swap(arr,2,4);
        System.out.println("After Swapping :"+Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
