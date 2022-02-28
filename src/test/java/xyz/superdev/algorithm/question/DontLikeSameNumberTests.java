package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DontLikeSameNumberTests {

  private static DontLikeSameNumber dontLikeSameNumber;

  @BeforeAll
  public static void setUp() {
    dontLikeSameNumber = new DontLikeSameNumber();
  }

  @Test
  public void given_ContainDuplicateNumberArray_when_Distinct_then_DistinctArray() {
    int[] arr = {1, 1, 3, 3, 0, 1, 1};

    int[] actual = dontLikeSameNumber.solve(arr);

    int[] expected = {1, 3, 0, 1};
    assertArrayEquals(expected, actual);
  }

}
