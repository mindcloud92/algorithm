package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculateAverageTests {

  private static CalculateAverage calculateAverage;

  @BeforeAll
  public static void setUp() {
    calculateAverage = new CalculateAverage();
  }

  @Test
  public void given_IntegerArray_when_CalculateAverage_then_Average() {
    int[] array = {1, 2, 3, 4};

    double actual = calculateAverage.solve(array);

    double expected = 2.5;
    assertEquals(expected, actual);
  }

}
