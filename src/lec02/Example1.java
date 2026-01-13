package lec02;

public class Example1 {
    public static void main(String[] args){
        // Primitive Data Types
        byte by = 127;
        short sh = 12345;
        int n= 1234567893;
        long l = 1234567890;
        float fl = 9.9f;
        float fl2 = 1e37f;
        double d = 9.9;
        boolean b = false;
        char c = 'v';

        // print all primitive data types
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("int: " + n);
        System.out.println("long: " + l);
        System.out.println("float: " + fl);
        System.out.println("float (1e37): " + fl2);
        System.out.println("double: " + d);
        System.out.println("boolean: " + b);
        System.out.println("char: " + c);

        // Reference Data Types
        String s1 = "Hello there";
        String s2 = "Hi";
        String[] sA = {"Hi", "Bye"};
        byte[] bA = {1, 2, 10, 15};
        int[] nA = {1, 2, 10, 15};
        char[] cA = {'H', 'i', '!'};
        float[] fA = {2.5f, 3.2f};

        // print all reference data types
        System.out.println("String s1: " + s1);
        System.out.println("String s2: " + s2);
        System.out.print("String Array sA: " + sA);
        System.out.print("byte Array bA: " + bA);
        System.out.print("int Array nA: " + nA);
        System.out.print("char Array cA: " + cA);
        System.out.print("float Array fA: " + fA);
    }
}
