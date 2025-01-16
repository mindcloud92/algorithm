package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RepeatBinaryConvertTests {

    private static RepeatBinaryConvert repeatBinaryConvert;

    @BeforeAll
    public static void setUp() {
        repeatBinaryConvert = new RepeatBinaryConvert();
    }

    @Test
    public void given_BinaryString_when_RemoveZeroAndBinaryConvert_then_ConversionCountAndRemovedZeroCountArrayReachedInOne() {
        String s = "110010101001";

        int[] actual = repeatBinaryConvert.solve(s);

        int[] expected = {3, 8};
        assertArrayEquals(expected, actual);
    }

}
