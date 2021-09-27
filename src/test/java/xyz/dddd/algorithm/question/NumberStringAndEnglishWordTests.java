package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberStringAndEnglishWordTests {

  private static NumberStringAndEnglishWord numberStringAndEnglishWord;

  @BeforeAll
  public static void setUp() {
    numberStringAndEnglishWord = new NumberStringAndEnglishWord();
  }

  @Test
  public void given_Compound_when_MapEnglishWordToNumberString_then_OnlyNumber() {
    String s = "2three45sixseven";

    int actual = numberStringAndEnglishWord.solve(s);

    int expected = 234567;
    assertEquals(expected, actual);
  }

}
