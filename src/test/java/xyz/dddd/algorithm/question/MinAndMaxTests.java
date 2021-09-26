package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MinAndMaxTests {

  private static MinAndMax minAndMax;

  @BeforeAll
  public static void setUp() {
    minAndMax = new MinAndMax();
  }

  @Test
  public void given() {
    String s = "1 2 3 4";

    String actual = minAndMax.solve(s);

    String expected = "1 4";
    assertEquals(expected, actual);
  }

}
