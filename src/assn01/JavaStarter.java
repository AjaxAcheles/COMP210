package assn01;

import java.util.Scanner;

public class JavaStarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World!\n");
        } else if (n == 2) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            int m = scanner.nextInt();
            System.out.println("a = " + a + ", b = " + b + ", m = " + m);
        } else if (n == 3) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            int m = scanner.nextInt();
            double result = quadFun(a, b, m);
            System.out.println(result);
        } else if (n == 4) {
            scanner.nextLine();
            String s1 = scanner.nextLine();
            System.out.println(stringFun1(s1));
        } else if (n == 5) {
            // Consume the leftover newline character
            scanner.nextLine();
            String s1 = scanner.nextLine();
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();
            int i4 = scanner.nextInt();
            System.out.println(stringFun2(s1, i1, i2, i3, i4));
        } else if (n == 6) {
            // Consume the leftover newline character
            scanner.nextLine();
            int m = scanner.nextInt();
            double[] numbersArray = new double[m];

            // Get m real numbers from the user and enter these in the array.
            int index = 0;
            while (index < m) {
                double nextNumber = scanner.nextDouble();
                numbersArray[index] = nextNumber;
                index++;
            }  

            // Get average
            double total = 0;
            for (index = 0; index < m; index++) {
                total = total + numbersArray[index];
            }
            double realAverage = total / m;
            double realAverageTimes100 = realAverage * 100;
            double roundedAverageTimes100 = (int) realAverageTimes100;
            double roundedAverage = roundedAverageTimes100 / 100;

            System.out.println("Average = " + roundedAverage);

            // Print all numbers in list
            for (index = numbersArray.length - 1; index >= 0; index--) {
                System.out.println("arr[" + index + "]=" + numbersArray[index]);
            }
        }
        // Close the scanner
        scanner.close();
    }
    public static double quadFun(double a, double b, int m) {
        double result = a * m*m + b;
        return result;
    }

    public static int stringFun1(String s1) {
        return s1.length();
    }

    public static String stringFun2(String s1, int i1, int i2, int i3, int i4) {
        String sA = s1.substring(i1, i2);
        String sB = s1.substring(i3, i4);
        return sA + sB;
    }
}
