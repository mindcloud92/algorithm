package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import xyz.dddd.algorithm.lesson.lyrics.LyricsSearch;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LyricsSearchTest {

  private static LyricsSearch lyricsSearch;

  @BeforeAll
  public static void setUp() {
    lyricsSearch = new LyricsSearch();
  }

  @Test
  public void givenMultipleWordAndPrefixPatternWhenMatchThen() {
    String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
    String pattern = "fro??";

    int actual = lyricsSearch.matches(words, pattern);

    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void givenMultipleWordAndSuffixPatternWhenMatchThen() {
    String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao", "foo"};
    String pattern = "????o";

    int actual = lyricsSearch.matches(words, pattern);

    int expected = 2;
    assertEquals(expected, actual);
  }

  @Test
  public void givenMultipleWordAndMixPatternWhenMatchThen() {
    String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao", "foo"};
    String[] patterns = {"fro??", "????o", "fr???", "fro???", "pro?", "???"};

    int[] actual = lyricsSearch.matches(words, patterns);

    int[] expected = {3, 2, 4, 1, 0, 1};
    assertArrayEquals(expected, actual);
  }

}
