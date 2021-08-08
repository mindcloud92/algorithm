package xyz.dddd.algorithm.lesson;

import java.util.Arrays;

/**
 * <h1>숫자 게임</h1>
 * <ul>
 *   <li>
 *     <a href="https://programmers.co.kr/learn/courses/30/lessons/12987">Programmers question</a>
 *   </li>
 * </ul>
 */
public class NumberGame {

  public int maxLastTeamWinner(final int[] firstTeam, final int[] lastTeam) {
    Arrays.sort(firstTeam);
    Arrays.sort(lastTeam);

    int winnerCount = 0;
    for (int i = firstTeam.length - 1, li = firstTeam.length - 1; i >= 0; i--) {
      if (firstTeam[i] < lastTeam[li]) {
        winnerCount++;
        li--;
      }
    }

    return winnerCount;
  }

}
