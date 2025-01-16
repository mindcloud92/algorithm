package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SumNumberPerDigitTests {

    private static SumNumberPerDigit sumNumberPerDigit;

    @BeforeAll
    public static void setUp() {
        sumNumberPerDigit = new SumNumberPerDigit();
    }

    @Test
    public void given_ThreeDigitNumber_when_SumNumberPerDigit_then_Sum() {
        int number = 987;

        int actual = sumNumberPerDigit.solve(number);

        int expected = 24;
        assertEquals(expected, actual);
    }

}
