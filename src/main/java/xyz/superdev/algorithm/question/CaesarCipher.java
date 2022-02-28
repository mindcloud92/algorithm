package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12926">"시저 암호"</a></h1>
 * <p>· 문제: 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>공백은 아무리 밀어도 공백</li>
 *   <li>s의 구성: 알파벳 소문자, 대문자, 공백</li>
 *   <li>s의 길이: 8000이하</li>
 *   <li>공백은 아무리 밀어도 공백</li>
 *   <li>n의 범위: 1 이상, 25이하인 자연수</li>
 * </ol>
 */
public class CaesarCipher {

  public String solve(final String s, final int n) {
    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == ' ') {
        continue;
      }

      chars[i] = shiftCharacter(chars[i], n);
    }

    return new String(chars);
  }

  private char shiftCharacter(final int current, final int shiftCount) {
    int next = current + shiftCount;
    if (isLowercaseRangeOver(current, next)) {
      next += 'a' - 'z' - 1;
    } else if (isUppercaseRangeOver(current, next)) {
      next += 'A' - 'Z' - 1;
    }

    return (char) next;
  }

  private boolean isLowercaseRangeOver(final int current, final int next) {
    return current >= 'a' && current <= 'z' && next > 'z';
  }

  private boolean isUppercaseRangeOver(final int current, final int next) {
    return current >= 'A' && current <= 'Z' && next > 'Z';
  }
}
