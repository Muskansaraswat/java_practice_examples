package java_practice.AnotherPackage;

import java_practice.AccessModifiers.ProtectedClassExample;

/* Points to keep in mind while using protected:-
* The protected access modifier is accessible within package and outside the package but through inheritance only.
* The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
* It provides more accessibility than the default modifer.
*/
class AccessingProtectedMethod extends ProtectedClassExample {
    public static void main(String[] args) {
        AccessingProtectedMethod pc = new AccessingProtectedMethod();
        pc.greeting();
        //if we make obj of parent class i.e.
        // ProtectedClassExample then we won't able to access the greeting method it will give compile time error
    }
}
