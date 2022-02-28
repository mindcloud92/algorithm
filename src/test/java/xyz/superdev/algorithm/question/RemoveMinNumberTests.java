package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RemoveMinNumberTests {

  private static RemoveMinNumber removeMinNumber;

  @BeforeAll
  public static void setUp() {
    removeMinNumber = new RemoveMinNumber();
  }

  @Test
  public void given_MultipleElementArray_when_RemoveMinNumber_then_RemovedMinNumberArray() {
    int[] array = {4, 3, 2, 1};

    int[] actual = removeMinNumber.solve(array);

    int[] expected = {4, 3, 2};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void given_OneElementArray_when_RemoveMinNumber_then_InvalidArray() {
    int[] array = {10};

    int[] actual = removeMinNumber.solve(array);

    int[] expected = {-1};
    assertArrayEquals(expected, actual);
  }

}
