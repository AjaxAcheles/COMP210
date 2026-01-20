package lec04;

import java.util.Scanner;

public class StackLimit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter k:");
            long k = s.nextLong();
            System.out.println(limitS(k));
        }
    }
    public static double limitS(long n){
        if (n == 0) {
            return (1);
        }
        else {
            double result = 1+ limitS(n-1);
            return (result);
        }
    }
}
