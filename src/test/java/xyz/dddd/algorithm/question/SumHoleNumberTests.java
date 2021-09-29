package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SumHoleNumberTests {

  private static SumHoleNumber sumHoleNumber;

  @BeforeAll
  public static void setUp() {
    sumHoleNumber = new SumHoleNumber();
  }

  @Test
  public void given_NumberArray_when_FindHoleNumberAndSum_then_Sum() {
    int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

    int actual = sumHoleNumber.solve(numbers);

    int expected = 14;
    assertEquals(expected, actual);
  }

}
