package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EnglishWordChainTest {

  private static EnglishWordChain englishWordChain;

  @BeforeAll
  public static void setUp() {
    englishWordChain = new EnglishWordChain();
  }

  @Test
  public void givenWordsAndPeopleCountWhenFindFirstOutInfoThen() {
    int peopleCount = 3;
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

    int[] actual = englishWordChain.findFirstOutInfo(peopleCount, words);

    int[] expected = new int[]{3, 3};
    assertArrayEquals(expected, actual);
  }

}

