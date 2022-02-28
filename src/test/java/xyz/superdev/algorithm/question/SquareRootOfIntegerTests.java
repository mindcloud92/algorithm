package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SquareRootOfIntegerTests {

  private static SquareRootOfInteger squareRootOfInteger;

  @BeforeAll
  public static void setUp() {
    squareRootOfInteger = new SquareRootOfInteger();
  }

  @Test
  public void given_SquareNumber_when_PowNextSqrt_then_PowNextSqrt() {
    int number = 121;

    long actual = squareRootOfInteger.solve(number);

    long expected = 144;
    assertEquals(expected, actual);
  }

  @Test
  public void given_NotSquareNumber_when_PowNextSqrt_then_InvalidNumber() {
    int number = 3;

    long actual = squareRootOfInteger.solve(number);

    long expected = -1;
    assertEquals(expected, actual);
  }

}