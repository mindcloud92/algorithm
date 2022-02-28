package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReverseByThreeDigitTests {

  private static ReverseByThreeDigit reverseByThreeDigit;

  @BeforeAll
  public static void setUp() {
    reverseByThreeDigit = new ReverseByThreeDigit();
  }

  @Test
  public void given_DecimalNumber_when_ReverseByThreeDigitToDecimalNumber_then_DecimalNumber() {
    int decimal = 45;

    int actual = reverseByThreeDigit.solve(decimal);

    int expected = 7;
    assertEquals(expected, actual);
  }

}
