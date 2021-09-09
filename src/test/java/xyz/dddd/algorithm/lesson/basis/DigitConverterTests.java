package xyz.dddd.algorithm.lesson.basis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitConverterTests {

  @Test
  public void givenDecimalAndRadixAndDigitsWhenCalculateLength() {
    int decimal = 4768;
    int radix = 16;

    int actual = DigitConverter.calculateLength(decimal, radix, new char[4]);

    int expected = 4;
    assertEquals(expected, actual);
  }
}
