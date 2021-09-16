package xyz.dddd.algorithm.lesson.basis;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTests {

  private static int[] DEFAULT_SORTED_ARRAY;

  @BeforeAll
  public static void setUp() {
    DEFAULT_SORTED_ARRAY = new int[1000];
    for (int i = 0; i < DEFAULT_SORTED_ARRAY.length; i++) {
      DEFAULT_SORTED_ARRAY[i] = i + 1;
    }
  }

  @Test
  public void givenArrayWhenMaxOfThen() {
    int actual = Array.maxOf(DEFAULT_SORTED_ARRAY);

    int expected = DEFAULT_SORTED_ARRAY[DEFAULT_SORTED_ARRAY.length - 1];
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

  @Test
  public void givenArrayAndExistsKeyWhenSentinelSearchThen() {
    int key = 5;

    int actual = Array.sentinelSearch(DEFAULT_SORTED_ARRAY, key);

    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void givenArrayAndEmptyKeyWhenSentinelSearchThen() {
    int key = DEFAULT_SORTED_ARRAY.length + 1;

    int actual = Array.sentinelSearch(DEFAULT_SORTED_ARRAY, key);

    int expected = -1;
    assertEquals(expected, actual);
  }


  @Test
  public void givenArrayAndExistsKeyWhenBinarySearchThen() {
    int key = 5;

    int actual = Array.binarySearch(DEFAULT_SORTED_ARRAY, key);

    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void givenArrayAndEmptyKeyWhenBinarySearchThen() {
    int key = DEFAULT_SORTED_ARRAY.length + 1;

    int actual = Array.binarySearch(DEFAULT_SORTED_ARRAY, key);

    int expected = -1;
    assertEquals(expected, actual);
  }

  @Test
  public void givenArrayAndExistsKeyWhenLinearSearchThen() {
    int key = 5;

    int actual = Array.linearSearch(DEFAULT_SORTED_ARRAY, key);

    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void givenArrayAndEmptyKeyWhenLinearSearchThen() {
    int key = DEFAULT_SORTED_ARRAY.length + 1;

    int actual = Array.linearSearch(DEFAULT_SORTED_ARRAY, key);

    int expected = -1;
    assertEquals(expected, actual);
  }
}
