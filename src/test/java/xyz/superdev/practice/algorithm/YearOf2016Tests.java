package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class YearOf2016Tests {

    private static YearOf2016 yearOf2016;

    @BeforeAll
    public static void setUp() {
        yearOf2016 = new YearOf2016();
    }

    @Test
    public void given_MonthAndDay_when_FormatDay_then_FormattedDay() {
        int month = 5;
        int day = 24;

        String actual = yearOf2016.solve(month, day);

        String expected = "TUE";
        assertEquals(expected, actual);
    }

}
