package xyz.dddd.algorithm.lesson.basis;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfYearTests {

  private static DayOfYear dayOfYear;

  @BeforeAll
  public static void setUp() {
    dayOfYear = new DayOfYear();
  }

  @Test
  public void givenLeapYearWhenIsLeapThen() {
    int year = 2020;

    boolean actual = dayOfYear.isLeap(year);

    assertTrue(actual);
  }

  @Test
  public void givenCommonYearWhenIsLeapThen() {
    int year = 2021;

    boolean actual = dayOfYear.isLeap(year);

    assertFalse(actual);
  }

  @Test
  public void givenDateWhenGetThen() {
    int year = 2019;
    int month = 3;
    int day = 15;

    int actual = dayOfYear.get(year, month, day);

    int expected = 74;
    assertEquals(expected, actual);
  }

  @Test
  public void givenDateWhenRemainThen() {
    int year = 2019;
    int month = 12;
    int day = 30;

    int actual = dayOfYear.remain(year, month, day);

    int expected = 1;
    assertEquals(expected, actual);
  }

}
