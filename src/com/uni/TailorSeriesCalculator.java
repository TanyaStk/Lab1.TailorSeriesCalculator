package com.uni;

import java.util.Scanner;

public class TailorSeriesCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = in.nextInt();
        double e = Math.pow(10, -k);
        System.out.println("Enter x (-1, 1): ");
        double x = in.nextDouble();
        try {
            if (x <= -1 | x >= 1) {
                throw new Exception("x is out of range");
            }
            double counted_ans = countValue(x, e);
            double func_ans = Math.asin(x);
            System.out.printf("Counted result: %.3f \n", counted_ans);
            System.out.printf("Function result: %.3f \n", func_ans);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        in.close();
    }

    static double countValue(double x, double e) {
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
