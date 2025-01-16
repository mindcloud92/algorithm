package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CountAndSumDivisorTests {

    private static CountAndSumDivisor countAndSumDivisor;

    @BeforeAll
    public static void setUp() {
        countAndSumDivisor = new CountAndSumDivisor();
    }

    @Test
    public void given_StartAndEnd_when_CountAndSumDivisor_then_Sum() {
        int start = 13;
        int end = 17;

        int actual = countAndSumDivisor.solve(start, end);

        int expected = 43;
        assertEquals(expected, actual);
    }

}
