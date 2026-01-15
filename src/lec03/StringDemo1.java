package lec03;

public class StringDemo1 {
    public static void main (String[] args){
        String s1 = "Hello";
        String s2 = "Hi";
        String s3 = "Hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.substring(1));
        System.out.println(s1.toLowerCase());
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1 == s3 : " + (s1 == s3));

        String s4 = new String("Hello");
        System.out.println("s1.equals(s4): " + s1.equals(s4));
        System.out.println("s1 == s4: " + (s1 == s4));

        System.out.println("s1: " + System.identityHashCode(s1));
        System.out.println("s3: " + System.identityHashCode(s3));
        System.out.println("s4: " + System.identityHashCode(s4));

        System.out.println();
    }
}
