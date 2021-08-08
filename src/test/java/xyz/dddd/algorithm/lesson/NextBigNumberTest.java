package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextBigNumberTest {

  private static final Map<Integer, Integer> EXPECTED_MAP = Map.of(
      78, 82,
      15, 23
  );

  private static NextBigNumber nextBigNumber;

  @BeforeAll
  public static void setUp() {
    nextBigNumber = new NextBigNumber();
  }

  @Test
  public void givenRandomDecimalNumberWhenFindThen() {
    int decimalNumber = randomDecimalNumber();

    int actual = nextBigNumber.find(decimalNumber);

    int expected = EXPECTED_MAP.get(decimalNumber);
    assertEquals(expected, actual);
  }

  private int randomDecimalNumber() {
    Set<Integer> keySet = EXPECTED_MAP.keySet();
    if (keySet.isEmpty()) {
      return 0;
    }

    List<Integer> keys = new ArrayList<>(keySet);
    return keys.get(new Random().nextInt(keys.size()));
  }

}
