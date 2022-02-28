package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberArrayBySpacedTests {

  private static NumberArrayBySpaced numberArrayBySpaced;

  @BeforeAll
  public static void setUp() {
    numberArrayBySpaced = new NumberArrayBySpaced();
  }

  @Test
  public void given_StartNumberAndLength_when_CreateArray_then_NumberArrayBySpaced() {
    int startNumber = 2;
    int length = 5;

    long[] actual = numberArrayBySpaced.solve(startNumber, length);

    long[] expected = {2, 4, 6, 8, 10};
    assertArrayEquals(expected, actual);
  }

}
