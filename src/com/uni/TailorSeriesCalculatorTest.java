package com.uni;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TailorSeriesCalculatorTest {

    @org.junit.jupiter.api.Test
    void testZeroCountTailorSeries() {
        double x = 0;
        double eps = Math.pow(10, -10);
        double expected = Math.asin(x);
        double actual = TailorSeriesCalculator.countTailorSeries(x, eps);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testPositiveCountTailorSeries() {
        double x = 0.5;
        double eps = Math.pow(10, -10);
        double expected = Math.asin(x);
        double actual = TailorSeriesCalculator.countTailorSeries(x, eps);
        assertEquals(expected, actual, 10E-6);
    }

    @org.junit.jupiter.api.Test
    void testNegativeCountTailorSeries() {
        double x = -0.5;
        double eps = Math.pow(10, -10);
        double expected = Math.asin(x);
        double actual = TailorSeriesCalculator.countTailorSeries(x, eps);
        assertEquals(expected, actual, 10E-6);
    }

    @org.junit.jupiter.api.Test
    void testFiveGetFactorial() {
        int n = 5;
        int actual = TailorSeriesCalculator.getFactorial(n);
        assertEquals(120, actual);
    }

    @org.junit.jupiter.api.Test
    void testOneGetFactorial() {
        int n = 1;
        int actual = TailorSeriesCalculator.getFactorial(n);
        assertEquals(1, actual);
    }
}