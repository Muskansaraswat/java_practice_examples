package java_practice.methods;

public class NonReturnTypeWithArgs {
    //Printing minimum value among two numbers passing as arguments in minFunction which have return type is void.
    public void minFunction(int a,int b){
        if(a<b){
            System.out.println("Minimum Value is :"+a);
        }
        else{
            System.out.println("Minimum Value is :"+b);
        }
    }

    public static void main(String[] args) {
        NonReturnTypeWithArgs obj=new NonReturnTypeWithArgs();
        obj.minFunction(20,10);
    }
}
