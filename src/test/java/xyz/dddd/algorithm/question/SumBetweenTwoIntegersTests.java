package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumBetweenTwoIntegersTests {

  private static SumBetweenTwoIntegers sumBetweenTwoIntegers;

  @BeforeAll
  public static void setUp() {
    sumBetweenTwoIntegers = new SumBetweenTwoIntegers();
  }

  @Test
  public void given_MinAndMax_when_SumBetween_then_CorrectSum() {
    int a = 3;
    int b = 5;

    long actual = sumBetweenTwoIntegers.solve(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void given_MaxAndMin_when_SumBetween_then_CorrectSum() {
    int a = 5;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solve(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void given_EqualsTwoIntegers_when_SumBetween_then_CorrectSum() {
    int a = 3;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solve(a, b);

    long expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void given_MinAndMax_when_SumBetweenByGauss_then_CorrectSum() {
    int a = 3;
    int b = 5;

    long actual = sumBetweenTwoIntegers.solveByGauss(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void given_MaxAndMin_when_SumBetweenByGauss_then_CorrectSum() {
    int a = 5;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solveByGauss(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void given_EqualsTwoIntegers_when_SumBetweenByGauss_then_CorrectSum() {
    int a = 3;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solveByGauss(a, b);

    long expected = 3;
    assertEquals(expected, actual);
  }

}
