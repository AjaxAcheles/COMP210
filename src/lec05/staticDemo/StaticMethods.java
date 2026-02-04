package lec05.staticDemo;

public class StaticMethods {
    public static void main(String[] args){

        // ***** static vs non-static METHODS:
        ClassB.staticMethod();

//        ClassB.nonStaticMethod();         // This will not work
        ClassB x = new ClassB();
        x.nonStaticMethod();   // non-static methods can only be called on objects such as x
    }
}

class ClassB {
    static void staticMethod() {
        System.out.println("This is a Static Method");
    }
    void nonStaticMethod() {
        System.out.println("This is a NON-Static Method");
    }
}
