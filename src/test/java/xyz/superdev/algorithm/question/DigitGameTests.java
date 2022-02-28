package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DigitGameTests {

  private static DigitGame digitGame;

  @BeforeAll
  public static void setUp() {
    digitGame = new DigitGame();
  }

  @Test
  public void given_RequiredParameters_when_StartGame_then_TubeSaidNDigitString() {
    int n = 16;
    int t = 16;
    int m = 2;
    int p = 1;

    String actual = digitGame.solve(n, t, m, p);

    String expected = "02468ACE11111111";
    assertEquals(expected, actual);
  }

}
