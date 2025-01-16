package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConvertToJadenCaseTests {

    private static ConvertToJadenCase convertToJadenCase;

    @BeforeAll
    public static void setUp() {
        convertToJadenCase = new ConvertToJadenCase();
    }

    @Test
    public void given_String_when_ConvertToJadenCase_then_JadenCaseString() {
        String s = "3people unFollowed me";

        String actual = convertToJadenCase.solve(s);

        String expected = "3people Unfollowed Me";
        assertEquals(expected, actual);
    }

}