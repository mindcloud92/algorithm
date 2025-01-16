package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SumOfBetweenTwoIntegersTests {

    private static SumOfBetweenTwoIntegers sumOfBetweenTwoIntegers;

    @BeforeAll
    public static void setUp() {
        sumOfBetweenTwoIntegers = new SumOfBetweenTwoIntegers();
    }

    @Test
    public void given_MinAndMax_when_SumOfBetween_then_Sum() {
        int a = 3;
        int b = 5;

        long actual = sumOfBetweenTwoIntegers.solve(a, b);

        long expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void given_MaxAndMin_when_SumOfBetween_then_Sum() {
        int a = 5;
        int b = 3;

        long actual = sumOfBetweenTwoIntegers.solve(a, b);

        long expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void given_EqualsTwoIntegers_when_SumOfBetween_then_Sum() {
        int a = 3;
        int b = 3;

        long actual = sumOfBetweenTwoIntegers.solve(a, b);

        long expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void given_MinAndMax_when_SumOfBetweenByGauss_then_Sum() {
        int a = 3;
        int b = 5;

        long actual = sumOfBetweenTwoIntegers.solveByGauss(a, b);

        long expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void given_MaxAndMin_when_SumOfBetweenByGauss_then_Sum() {
        int a = 5;
        int b = 3;

        long actual = sumOfBetweenTwoIntegers.solveByGauss(a, b);

        long expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void given_EqualsTwoIntegers_when_SumOfBetweenByGauss_then_Sum() {
        int a = 3;
        int b = 3;

        long actual = sumOfBetweenTwoIntegers.solveByGauss(a, b);

        long expected = 3;
        assertEquals(expected, actual);
    }

}
