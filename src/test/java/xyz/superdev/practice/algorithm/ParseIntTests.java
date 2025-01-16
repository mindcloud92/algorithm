package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ParseIntTests {

    private static ParseInt parseInt;

    @BeforeAll
    public static void setUp() {
        parseInt = new ParseInt();
    }

    @Test
    public void given_NegativeNumberString_when_ParseInt_then_NegativeNumber() {
        String number = "1234";

        int actual = parseInt.solve(number);

        int expected = 1234;
        assertEquals(expected, actual);
    }

    @Test
    public void given_PositiveNumberString_when_ParseInt_then_PositiveNumber() {
        String number = "-1234";

        int actual = parseInt.solve(number);

        int expected = -1234;
        assertEquals(expected, actual);
    }

}
