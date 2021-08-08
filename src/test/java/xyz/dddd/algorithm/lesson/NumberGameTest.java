package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberGameTest {

  private static NumberGame numberGame;

  @BeforeAll
  public static void setUp() {
    numberGame = new NumberGame();
  }

  @Test
  public void givenTwoTeamWhenMaxLastTeamWinnerThen() {
    int[] firstTeam = {5, 1, 3, 7};
    int[] lastTeam = {2, 2, 6, 8};

    int actual = numberGame.maxLastTeamWinner(firstTeam, lastTeam);

    int expected = 3;
    assertEquals(expected, actual);
  }

}
