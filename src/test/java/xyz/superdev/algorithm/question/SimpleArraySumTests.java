package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SimpleArraySumTests {

  private static SimpleArraySum simpleArraySum;

  @BeforeAll
  public static void setUp() {
    simpleArraySum = new SimpleArraySum();
  }

  @Test
  public void given_Array_when_SumElement_then_Sum() {
    List<Integer> array = List.of(1, 2, 3, 4, 10, 11);

    int actual = simpleArraySum.solve(array);

    int expected = 31;
    assertEquals(expected, actual);
  }

}
