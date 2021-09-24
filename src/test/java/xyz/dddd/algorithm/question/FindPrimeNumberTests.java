package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPrimeNumberTests {

  private static FindPrimeNumber findPrimeNumber;

  @BeforeAll
  public static void setUp() {
    findPrimeNumber = new FindPrimeNumber();
  }

  @Test
  public void given_EndNumber_when_FindPrimeNumberBetween1AndEndNumber_then_PrimeNumberTotalCount() {
    int end = 10;

    int actual = findPrimeNumber.solve(end);

    int expected = 4;
    assertEquals(expected, actual);
  }

}
