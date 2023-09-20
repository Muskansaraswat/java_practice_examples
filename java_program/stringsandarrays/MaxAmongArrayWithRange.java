package java_practice.stringsandarrays;
// max among a given range of index
public class MaxAmongArrayWithRange {
    public static void main(String[] args) {
        int[] itemNumber = {51, 85, 79, 76, 32};
        int max=maxRange(itemNumber,2,4);
        System.out.println("Max is : "+max);
    }
    // max among all the array elements
    static int maxRange(int[] arr, int index1, int  index2) {
        if(index1>index2){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int max = arr[index1];
        for (int i = index1; i < index2; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
