package xyz.dddd.algorithm.question;

import java.util.Map;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/77484">"로또의 최고 순위와 최저
 * 순위"</a></h1>
 * <p>· 문제: 민우가 구매한 로또 번호와 당첨 번호를 비교해서 나올 수 있는 최고 순위와 최저순위를 차례대로 배열에 담아 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>lottos의 길이: 6</li>
 *   <li>lottos의 원소 범위: 0 이상 45 이하인 정수</li>
 *   <li>lottos의 원소가 0인 경우 알 수 없는 숫자를 의미</li>
 *   <li>0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않음</li>
 *   <li>win_nums의 길이: 6</li>
 *   <li>win_nums에는 같은 숫자가 2개 이상 담겨있지 않음</li>
 *   <li>순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정</li>
 * </ol>
 */
public class MinAndMaxRankOfLotto {

  private static final Map<Integer, Integer> RANK_MAP = Map.of(
      6, 1,
      5, 2,
      4, 3,
      3, 4,
      2, 5
  );

  private static final Integer DEFAULT_RANK = 6;

  private static final Integer UNKNOWN_NUMBER = 0;

  public int[] solve(final int[] lottos, final int[] win_nums) {
    int maxMatchCount = 0;
    int minMatchCount = 0;
    for (int lotto : lottos) {
      if (lotto == UNKNOWN_NUMBER) {
        maxMatchCount++;
        continue;
      }

      int actualMatchCount = isExistMatchNumber(lotto, win_nums) ? 1 : 0;
      maxMatchCount += actualMatchCount;
      minMatchCount += actualMatchCount;
    }

    return new int[]{
        RANK_MAP.getOrDefault(maxMatchCount, DEFAULT_RANK),
        RANK_MAP.getOrDefault(minMatchCount, DEFAULT_RANK)
    };
  }

  private boolean isExistMatchNumber(final int target, final int[] sources) {
    for (int source : sources) {
      if (source == target) {
        return true;
      }
    }

    return false;
  }
}
