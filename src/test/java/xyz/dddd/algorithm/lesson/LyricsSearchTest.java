package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LyricsSearchTest {

  private static LyricsSearch lyricsSearch;

  @BeforeAll
  public static void setUp() {
    lyricsSearch = new LyricsSearch();
  }

  @Test
  public void givenWordAndSuffixPatternWhenMatchThen() {
    String word = "frodo";
    String pattern = "fro??";

    boolean actual = lyricsSearch.isMatch(word, pattern);

    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void givenWordAndPrefixPatternWhenMatchThen() {
    String word = "frodo";
    String pattern = "????o";

    boolean actual = lyricsSearch.isMatch(word, pattern);

    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void givenMultipleWordAndPatternWhenMatchThen() {
    String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
    String pattern = "fro??";

    int actual = lyricsSearch.match(words, pattern);

    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void givenMultipleWordAndMultiplePatternWhenMatchThen() {
    String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
    String[] patterns = {"fro??", "????o", "fr???", "fro???", "pro?"};

    int[] actual = lyricsSearch.matches(words, patterns);

    int[] expected = {3, 2, 4, 1, 0};
    assertArrayEquals(expected, actual);
  }

}
