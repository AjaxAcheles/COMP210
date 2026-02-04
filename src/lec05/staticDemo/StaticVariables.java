package lec05.staticDemo;

public class StaticVariables {
    public static void main(String[] args) {

        // ***** static vs non-static VARIABLES:
        System.out.println(ClassA._staticVar);   // staticVar does not require instantiating the class

//      System.out.println(ClassA.nonStaticVar);// This will not work
        ClassA x = new ClassA();               // instantiating ClassA and creating object cA
        System.out.println(x._nonStaticVar);    // nonStaticVar can only be accessed via an object
    }
}

class ClassA {
    static int _staticVar = 20;
    int _nonStaticVar = 30;
}
