package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TwoStringsTests {

    private static TwoStrings twoStrings;

    @BeforeAll
    public static void setUp() {
        twoStrings = new TwoStrings();
    }

    @Test
    public void given_ShareCharacterTwoString_when_Compare_then_YES() {
        String s1 = "hello";
        String s2 = "world";

        String actual = twoStrings.solve(s1, s2);

        String expected = "YES";
        assertEquals(expected, actual);
    }

    @Test
    public void given_DifferCharacterTwoString_when_Compare_then_NO() {
        String s1 = "hi";
        String s2 = "world";

        String actual = twoStrings.solve(s1, s2);

        String expected = "NO";
        assertEquals(expected, actual);
    }

}
