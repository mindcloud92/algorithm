package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfCorrectParenthesesTest {

  @Test
  public void givenTwoPairParenthesesWhenCountThen() {
    int pairCount = 2;

    int actual = NumberOfCorrectParentheses.count(pairCount);

    int expected = 2;
    assertEquals(expected, actual);
  }

  @Test
  public void givenThreePairParenthesesWhenCountThen() {
    int pairCount = 3;

    int actual = NumberOfCorrectParentheses.count(pairCount);

    int expected = 5;
    assertEquals(expected, actual);
  }

  @Test
  public void givenSevenPairParenthesesWhenCountThen() {
    int pairCount = 7;

    int actual = NumberOfCorrectParentheses.count(pairCount);

    int expected = 429;
    assertEquals(expected, actual);
  }

  @Test
  public void givenFourteenPairParenthesesWhenCountThen() {
    int pairCount = 14;

    int actual = NumberOfCorrectParentheses.count(pairCount);

    int expected = 2674440;
    assertEquals(expected, actual);
  }

}
