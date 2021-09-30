package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EnglishWordChainGameTests {

  private static EnglishWordChainGame englishWordChainGame;

  @BeforeAll
  public static void setUp() {
    englishWordChainGame = new EnglishWordChainGame();
  }

  @Test
  public void given_InvalidWordChainArray_when_FindFirstKnockOutInfo_then_FirstKnockOutInfo() {
    int n = 3;
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

    int[] actual = englishWordChainGame.solve(n, words);

    int[] expected = {3, 3};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void given_CorrectWordChainArray_when_FindFirstKnockOutInfo_then_DefaultArray() {
    int n = 5;
    String[] words = {
        "hello", "observe", "effect", "take", "either", "recognize", "encourage",
        "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"
    };

    int[] actual = englishWordChainGame.solve(n, words);

    int[] expected = {0, 0};
    assertArrayEquals(expected, actual);
  }

}