package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RepeatWatermelonTests {

  private static RepeatWatermelon repeatWatermelon;

  @BeforeAll
  public static void setUp() {
    repeatWatermelon = new RepeatWatermelon();
  }

  @Test
  public void given_OddLength_when_Repeat_then_OddLengthWatermelonString() {
    int length = 3;

    String actual = repeatWatermelon.solve(length);

    String expected = "수박수";
    assertEquals(expected, actual);
  }

  @Test
  public void given_EvenLength_when_Repeat_then_EvenLengthWatermelonString() {
    int length = 4;

    String actual = repeatWatermelon.solve(length);

    String expected = "수박수박";
    assertEquals(expected, actual);
  }


}
