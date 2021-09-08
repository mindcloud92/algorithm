package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import xyz.dddd.algorithm.question.programmers.SumBetweenTwoIntegers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumBetweenTwoIntegersTests {

  private static SumBetweenTwoIntegers sumBetweenTwoIntegers;

  @BeforeAll
  public static void setUp() {
    sumBetweenTwoIntegers = new SumBetweenTwoIntegers();
  }

  @Test
  public void givenMinAndMaxWhenSolveThen() {
    int a = 3;
    int b = 5;

    long actual = sumBetweenTwoIntegers.solve(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void givenReverseMinAndMaxWhenSolveThen() {
    int a = 5;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solve(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void givenEqualsTwoIntegerWhenSolveThen() {
    int a = 3;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solve(a, b);

    long expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void givenMinAndMaxWhenSolveByGaussThen() {
    int a = 3;
    int b = 5;

    long actual = sumBetweenTwoIntegers.solveByGauss(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void givenReverseMinAndMaxWhenSolveByGaussThen() {
    int a = 5;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solveByGauss(a, b);

    long expected = 12;
    assertEquals(expected, actual);
  }

  @Test
  public void givenEqualsTwoIntegerWhenSolveByGaussThen() {
    int a = 3;
    int b = 3;

    long actual = sumBetweenTwoIntegers.solveByGauss(a, b);

    long expected = 3;
    assertEquals(expected, actual);
  }

}
