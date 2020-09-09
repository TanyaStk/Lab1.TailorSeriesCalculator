package com.uni;

import java.util.Scanner;

public class TailorSeriesCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter k: ");
            int k = scanner.nextInt();
            double e = Math.pow(10, -k);
            System.out.println("Enter x (-1, 1): ");
            double x = scanner.nextDouble();
            if (x <= -1 || x >= 1) {
                throw new Exception("x is out of range");
            }
            double countedAns = countTailorSeries(x, e);
            double funcAns = Math.asin(x);
            System.out.printf("Counted result: %.3f \n", countedAns);
            System.out.printf("Function result: %.3f \n", funcAns);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static double countTailorSeries(double x, double e) {
        double elem = 100;
        double result = 0;
        int n = 0;
        while (Math.abs(elem) >= Math.abs(e)) {
            elem = (getFactorial(2 * n) * Math.pow(x, 2 * n + 1)) /
                    (Math.pow(4, n) * Math.pow(getFactorial(n), 2) * (2 * n + 1));
            result += elem;
            n++;
        }
        return result;
    }

    static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}
