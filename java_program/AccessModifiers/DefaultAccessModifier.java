package java_practice.AccessModifiers;

class DefaultAccessModifier {
    void message() {
        System.out.println("This is a default class member can't be accessed from outside the Another package");
    }
    void success(){
        System.out.println("default class and default method can be accessed in same pkg another class");
    }
}
