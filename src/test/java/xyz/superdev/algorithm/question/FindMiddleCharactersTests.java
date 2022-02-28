package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FindMiddleCharactersTests {

  private static FindMiddleCharacters findMiddleCharacters;

  @BeforeAll
  public static void setUp() {
    findMiddleCharacters = new FindMiddleCharacters();
  }

  @Test
  public void given_OddLengthString_when_FindMiddleCharacters_then_OneMiddleCharacters() {
    String s = "abcde";

    String actual = findMiddleCharacters.solve(s);

    String expected = "c";
    assertEquals(expected, actual);
  }

  @Test
  public void given_EvenLengthString_when_FindMiddleCharacters_then_TwoMiddleCharacters() {
    String s = "qwer";

    String actual = findMiddleCharacters.solve(s);

    String expected = "we";
    assertEquals(expected, actual);
  }

}
