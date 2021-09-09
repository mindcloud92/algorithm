package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import xyz.dddd.algorithm.question.programmers.RadixGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadixGameTests {

  private static RadixGame radixGame;

  @BeforeAll
  public static void setUp() {
    radixGame = new RadixGame();
  }

  @Test
  public void givenWhenSolveThen() {
    int n = 16;
    int t = 16;
    int m = 2;
    int p = 1;

    String actual = radixGame.solve(n, t, m, p);

    String expected = "02468ACE11111111";
    assertEquals(expected, actual);
  }

}
