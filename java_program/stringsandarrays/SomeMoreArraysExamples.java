package java_practice.stringsandarrays;

public class SomeMoreArraysExamples {
    static int n=5;//if we make this static it will run properly
    static int[] myarray = new int[n];
    static int[] arr = new int['n'];

    public static void main(String[] args) {
        System.out.println(myarray.length);
        System.out.println(arr.length);
        //although myarray can be accessed in main method but still it will throw an error
        // java: non-static variable n cannot be referenced from a static context
        // because the n is not static in this case
        int[] a={23,67,43,21,19};
        int[] b = a;
        b[2]=31;
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
