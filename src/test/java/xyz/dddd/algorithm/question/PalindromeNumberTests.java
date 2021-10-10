package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTests {

  private static PalindromeNumber palindromeNumber;

  @BeforeAll
  public static void setUp() {
    palindromeNumber = new PalindromeNumber();
  }

  @Test
  public void given_OddPalindromeNumber_when_IsPalindromeNumber_then_True() {
    int n = 101;

    boolean actual = palindromeNumber.solve(n);

    assertTrue(actual);
  }

  @Test
  public void given_MinusNumber_when_IsPalindromeNumber_then_False() {
    int n = -101;

    boolean actual = palindromeNumber.solve(n);

    assertFalse(actual);
  }

  @Test
  public void given_EvenPalindromeNumber_when_IsPalindromeNumber_then_True() {
    int n = 1221;

    boolean actual = palindromeNumber.solve(n);

    assertTrue(actual);
  }

}
