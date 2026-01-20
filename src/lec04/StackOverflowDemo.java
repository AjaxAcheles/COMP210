package lec04;

import java.util.Scanner;

public class StackOverflowDemo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true) {
            long k = s.nextLong();
            System.out.println(recursiveMethod(k));
        }
    }
    public static long recursiveMethod(long n){
        if (n == 0) {
            return (1);
        }
        else {
            long result = 1+ recursiveMethod(n-1);
            return (result);
        }
    }

}
