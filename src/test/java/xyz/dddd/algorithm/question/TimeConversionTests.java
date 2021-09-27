package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TimeConversionTests {

  private static TimeConversion timeConversion;

  @BeforeAll
  public static void setUp() {
    timeConversion = new TimeConversion();
  }

  @Test
  public void given_PMTime_when_Format24Hour_then_Format24Hour() {
    String s = "07:05:45PM";

    String actual = timeConversion.solve(s);

    String expected = "19:05:45";
    assertEquals(expected, actual);
  }

  @Test
  public void given_Midnight_when_Format24Hour_then_Format24Hour() {
    String s = "12:40:22AM";

    String actual = timeConversion.solve(s);

    String expected = "00:40:22";
    assertEquals(expected, actual);
  }


  @Test
  public void given_AMTime_when_Format24Hour_then_Format24Hour() {
    String s = "06:40:03AM";

    String actual = timeConversion.solve(s);

    String expected = "06:40:03";
    assertEquals(expected, actual);
  }

}
