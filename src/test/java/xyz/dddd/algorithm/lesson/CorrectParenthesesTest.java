package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrectParenthesesTest {

  private static final Map<Integer, Integer> EXPECTED_MAP = Map.of(
      2, 2,
      3, 5,
      7, 429,
      14, 2674440
  );

  private static CorrectParentheses correctParentheses;

  @BeforeAll
  public static void setUp() {
    correctParentheses = new CorrectParentheses();
  }

  @Test
  public void givenPairCountsWhenCountThen() {
    int pairCount = randomPairCount();

    int actual = correctParentheses.maxCount(pairCount);

    int expected = EXPECTED_MAP.get(pairCount);
    assertEquals(expected, actual);
  }

  private int randomPairCount() {
    int key = (int) (Math.random() * 13) + 2;
    if (EXPECTED_MAP.containsKey(key)) {
      return key;
    }

    return randomPairCount();
  }

}
