package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberOf124CountriesTests {

  private static NumberOf124Countries numberOf124Countries;

  @BeforeAll
  public static void setUp() {
    numberOf124Countries = new NumberOf124Countries();
  }

  @Test
  public void given_DecimalNumber_when_To124CountriesNumber_then_124CountriesNumber() {
    int n = 10;

    String actual = numberOf124Countries.solve(n);

    String expected = "41";
    assertEquals(expected, actual);
  }

}
