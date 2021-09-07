package xyz.dddd.algorithm.lesson.basis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTests {

  @Test
  public void givenArrayWhenMaxOfThen() {
    int[] array = {1, 2, 3, 4, 5};

    int actual = Array.maxOf(array);

    int expected = 5;
    assertEquals(expected, actual);
  }

  @Test
  public void givenArrayWhenReverseThen() {
    int[] array = {66, 11, 33, 22, 55, 44};

    int[] actual = Array.reverse(array);

    int[] expected = {44, 55, 22, 33, 11, 66};
    assertArrayEquals(expected, actual);
  }

}
