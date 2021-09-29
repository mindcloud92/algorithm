package xyz.dddd.algorithm.question;

import java.util.Map;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12916">"문자열 내 p와 y의 개수"</a></h1>
 * <p>· 문제: 문자열 s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>문자열 s의 길이 : 50 이하의 자연수</li>
 *   <li>s의 구성: 알파벳</li>
 * </ol>
 */
public class CountPAndY {

  private static final Map<Character, Integer> VALID_CHARACTER_MAP = Map.of(
      'P', 1, 'p', 1,
      'Y', -1, 'y', -1
  );

  public boolean solve(final String s) {
    int sum = 0;
    for (char c : s.toCharArray()) {
      sum += VALID_CHARACTER_MAP.getOrDefault(c, 0);
    }

    return sum == 0;
  }
}
