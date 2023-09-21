package java_practice.AccessModifiers;

public class AccessingPrivate {
    public static void main(String[] args) {
        PrivateClass pr= new PrivateClass();
        // System.out.println(pr.otp);//Compile time error
        // pr.HolderName();//compile time error
        System.out.println(pr.fake_otp);
    }
}
