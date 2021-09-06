package xyz.dddd.algorithm.lesson.basis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {

  @Test
  public void givenThreeNumberWhenMaxThen() {
    int a = 1;
    int b = 3;
    int c = 2;

    int actual = Math.max(a, b, c);

    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void givenFourNumberWhenMaxThen() {
    int a = 1;
    int b = 2;
    int c = 4;
    int d = 3;

    int actual = Math.max(a, b, c, d);

    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void givenThreeNumberWhenMinThen() {
    int a = 1;
    int b = 3;
    int c = 2;

    int actual = Math.min(a, b, c);

    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  public void givenFourNumberWhenMinThen() {
    int a = 1;
    int b = 2;
    int c = 4;
    int d = 3;

    int actual = Math.min(a, b, c, d);

    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  public void givenThreeNumberWhenMidThen() {
    int a = 1;
    int b = 2;
    int c = 3;

    int actual = Math.mid(a, b, c);

    int expected = 2;
    assertEquals(expected, actual);
  }

}
