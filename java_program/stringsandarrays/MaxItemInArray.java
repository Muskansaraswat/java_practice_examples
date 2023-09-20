package java_practice.stringsandarrays;

public class MaxItemInArray {
    public static void main(String[] args) {
        int[] itemNumber = {51, 85, 49, 76, 32};
        int max=maxItem(itemNumber);
        System.out.println("Max is : "+max);
    }
// max among all the array elements
    static int maxItem(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
