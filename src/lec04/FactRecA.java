package lec04;

import java.util.Scanner;

public class FactRecA {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true) {
            int k = s.nextInt();
            System.out.println("factorial(" + k + ") = " + factorial(k));
        }
    }
    public static double factorial(int n){
        double a=1;
        double b=1;
        double c=1;
        long x=1;
        if (n == 0) {
            return (1);
        }
        else {
            double result = n * factorial(n-1);
            return (result);
        }
    }
}
