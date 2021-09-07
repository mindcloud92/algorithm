package xyz.dddd.algorithm.lesson.basis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  public void givenArrayWhenSumOfThen() {
    int[] array = {1, 2, 3, 4, 5};

    int actual = Array.sumOf(array);

    int expected = 15;
    assertEquals(expected, actual);
  }

  @Test
  public void givenArrayWhenEqualsThen() {
    int[] array = {1, 2, 3, 4, 5};
    int[] compareTarget = {1, 2, 3, 4, 5};

    boolean actual = Array.equals(array, compareTarget);

    assertTrue(actual);
  }

  @Test
  public void givenArrayWhenCopyThen() {
    int[] array = {1, 2, 3, 4, 5};

    int[] actual = Array.copy(array, new int[4]);

    int[] expected = {1, 2, 3, 4};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void givenArrayWhenReverseCopyThen() {
    int[] array = {1, 2, 3, 4, 5};

    int[] actual = Array.reverseCopy(array, new int[6]);

    int[] expected = {5, 4, 3, 2, 1, 0};
    assertArrayEquals(expected, actual);
  }
}
