package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfCorrectParenthesesTest {

  private static final Map<Integer, Integer> EXPECTED_MAP = Map.of(
      2, 2,
      3, 5,
      7, 429,
      14, 2674440
  );

  private static NumberOfCorrectParentheses numberOfCorrectParentheses;

  @BeforeAll
  public static void setUp() {
    numberOfCorrectParentheses = new NumberOfCorrectParentheses();
  }

  @Test
  public void givenRandomPairCountWhenCountThen() {
    int pairCount = randomPairCount();

    int actual = numberOfCorrectParentheses.count(pairCount);

    int expected = EXPECTED_MAP.get(pairCount);
    assertEquals(expected, actual);
  }

  private int randomPairCount() {
    Set<Integer> keySet = EXPECTED_MAP.keySet();
    if (keySet.isEmpty()) {
      return 0;
    }

    List<Integer> keys = new ArrayList<>(keySet);
    return keys.get(new Random().nextInt(keys.size()));
  }

}
