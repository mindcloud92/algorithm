package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumberPerDigitTests {

  private static SumNumberPerDigit sumNumberPerDigit;

  @BeforeAll
  public static void setUp() {
    sumNumberPerDigit = new SumNumberPerDigit();
  }

  @Test
  public void givenNumberWhenSolveThen() {
    int number = 987;

    int actual = sumNumberPerDigit.solve(number);

    int expected = 24;
    assertEquals(expected, actual);
  }

}
