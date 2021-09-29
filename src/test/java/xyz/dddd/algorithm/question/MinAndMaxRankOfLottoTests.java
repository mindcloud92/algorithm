package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MinAndMaxRankOfLottoTests {

  private static MinAndMaxRankOfLotto minAndMaxRankOfLotto;

  @BeforeAll
  public static void setUp() {
    minAndMaxRankOfLotto = new MinAndMaxRankOfLotto();
  }

  @Test
  public void given_LottoNumbersAndWinNumbers_when_FindMinAndMaxRank_then_MinaAndMaxRankArray() {
    int[] lottos = {44, 1, 0, 0, 31, 25};
    int[] winNumbers = {31, 10, 45, 1, 6, 19};

    int[] actual = minAndMaxRankOfLotto.solve(lottos, winNumbers);

    int[] expected = {3, 5};
    assertArrayEquals(expected, actual);
  }

}
