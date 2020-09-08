package com.uni;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TailorSeriesCalculatorTest {

    @org.junit.jupiter.api.Test
    void test1CountValue() {
        double x = 0;
        double eps = Math.pow(10, -10);
        double expected = Math.asin(x);
        double actual = TailorSeriesCalculator.countValue(x, eps);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test2CountValue() {
        double x = 0.5;
        double eps = Math.pow(10, -10);
        double expected = Math.asin(x);
        double actual = TailorSeriesCalculator.countValue(x, eps);
        assertNotEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test3CountValue() {
        double x = -0.5;
        double eps = Math.pow(10, -10);
        double expected = Math.asin(x);
        double actual = TailorSeriesCalculator.countValue(x, eps);
        assertNotEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void test1GetFactorial() {
        int n = 5;
        int actual = TailorSeriesCalculator.getFactorial(n);
        assertEquals(120, actual);
    }

    @org.junit.jupiter.api.Test
    void test2GetFactorial() {
        int n = 1;
        int actual = TailorSeriesCalculator.getFactorial(n);
        assertEquals(1, actual);
    }
}