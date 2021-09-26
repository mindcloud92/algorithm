package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SumWithAbsoluteAndSignTests {

  private static SumWithAbsoluteAndSign sumWithAbsoluteAndSign;

  @BeforeAll
  public static void setUp() {
    sumWithAbsoluteAndSign = new SumWithAbsoluteAndSign();
  }

  @Test
  public void given_AbsoluteAndSignPairs_when_Sum_then_Sum() {
    int[] absolutes = {4, 7, 12};
    boolean[] signs = {true, false, true};

    int actual = sumWithAbsoluteAndSign.solve(absolutes, signs);

    int expected = 9;
    assertEquals(expected, actual);
  }

}
