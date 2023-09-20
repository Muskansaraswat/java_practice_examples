package java_practice.stringsandarrays;

public class VariousTypesOfArrayDeclaration {
    int[] third_array= {46,71,29,37};//declaring outside main method inside class
    static int[] last_array;
    public static void main(String[] args) {
            int[] first_array = new int[5];
            for(int i=0; i<first_array.length;i++){
                System.out.print(first_array[i]+" ");// 0 0 0 0 0
            }
            System.out.println();
            int[] second_array= {22,54,63,85,96};// declaring with initialization with array values
            for(int i=0;i<second_array.length;i++){
                System.out.print(second_array[i]+" ");//22 54 63 85 96
            }
            System.out.println();
            //accessing non-static data member with the help of object
            VariousTypesOfArrayDeclaration obj= new VariousTypesOfArrayDeclaration();
            for(int i=0;i<obj.third_array.length;i++){
                System.out.print(obj.third_array[i]+" ");//46 71 29 37
            }
            System.out.println();
            System.out.println(last_array);//null object default value

    }
}
