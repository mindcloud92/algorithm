package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ZeroRemainderNumberArrayTests {

  private static ZeroRemainderNumberArray zeroRemainderNumberArray;

  @BeforeAll
  public static void setUp() {
    zeroRemainderNumberArray = new ZeroRemainderNumberArray();
  }

  @Test
  public void given_ContainMultipleNumberArrayAndDivisor_when_DivideByDivisorAndFindZeroRemainderNumberAndSort_then_SortedOnlyZeroRemainderNumberArray() {
    int[] array = {5, 9, 7, 10};
    int divisor = 5;

    int[] actual = zeroRemainderNumberArray.solve(array, divisor);

    int[] expected = {5, 10};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void given_NoneMultipleNumberArrayAndDivisor_when_DivideByDivisorAndFindZeroRemainderNumberAndSort_then_InvalidArray() {
    int[] array = {3, 2, 6};
    int divisor = 10;

    int[] actual = zeroRemainderNumberArray.solve(array, divisor);

    int[] expected = {-1};
    assertArrayEquals(expected, actual);
  }
}
