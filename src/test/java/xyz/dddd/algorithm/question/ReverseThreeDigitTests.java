package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseThreeDigitTests {

  private static ReverseThreeDigit reverseThreeDigit;

  @BeforeAll
  public static void setUp() {
    reverseThreeDigit = new ReverseThreeDigit();
  }

  @Test
  public void givenDecimalWhenSolveThen() {
    int decimal = 45;

    int actual = reverseThreeDigit.solve(decimal);

    int expected = 7;
    assertEquals(expected, actual);
  }

}
