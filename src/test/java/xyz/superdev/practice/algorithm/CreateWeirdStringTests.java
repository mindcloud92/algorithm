package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CreateWeirdStringTests {

    private static ConvertToWeirdString createWeirdString;

    @BeforeAll
    public static void setUp() {
        createWeirdString = new ConvertToWeirdString();
    }

    @Test
    public void given_SpecificString_when_ToWeirdString_then_WeirdString() {
        String s = "try hello world";

        String actual = createWeirdString.solve(s);

        String expected = "TrY HeLlO WoRlD";
        assertEquals(expected, actual);
    }

}
