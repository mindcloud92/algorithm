package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReverseNumberToArrayTests {

    private static ReverseNumberToArray reverseNumberToArray;

    @BeforeAll
    public static void setUp() {
        reverseNumberToArray = new ReverseNumberToArray();
    }

    @Test
    public void given_DecimalNumber_when_ReverseNumberToArray_then_Array() {
        long number = 12345;

        int[] actual = reverseNumberToArray.solve(number);

        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, actual);
    }

}
