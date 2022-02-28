package xyz.superdev.algorithm.question;

import java.util.Map;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12925">"문자열을 정수로 바꾸기"</a></h1>
 * <p>· 문제: 문자열 s를 숫자로 변환한 결과를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>s의 길이: 1이상 5이하</li>
 *   <li>s의 맨앞에는 부호(+,-)가 올 수 있음</li>
 *   <li>s의 구성: 부호, 숫자</li>
 *   <li>s는"0"으로 시작하지 않음</li>
 * </ol>
 */
public class ParseInt {

  private static final Map<Character, Integer> SIGN_MAP = Map.of('+', 1, '-', -1);

  private static final int ZERO_INT_VALUE = 48;

  public int solve(final String s) {
    int answer = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char current = s.charAt(i);
      if (SIGN_MAP.containsKey(current)) {
        answer *= SIGN_MAP.get(current);
        continue;
      }

      answer += (current - ZERO_INT_VALUE) * Math.pow(10, s.length() - i - 1);
    }

    return answer;
  }
}
