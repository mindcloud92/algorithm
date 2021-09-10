package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTests {

  private static PrimeNumberFinder primeNumberFinder;

  @BeforeAll
  public static void setUp() {
    primeNumberFinder = new PrimeNumberFinder();
  }

  @Test
  public void givenEndNumberWhenSolveThen() {
    int end = 10;

    int actual = primeNumberFinder.solve(end);

    int expected = 4;
    assertEquals(expected, actual);
  }

}
