package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://www.hackerrank.com/challenges/camelcase/problem">"CamelCase"</a></h1>
 * <p>· 문제: 문자열 s가 Camelcase 기준으로 구성되어있는 단어의 개수 반환</p>
 */
public class CamelCase {

  public int solve(final String s) {
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
      if (isUpperCase(s.charAt(i))) {
        count++;
      }
    }

    return count;
  }

  private boolean isUpperCase(final char c) {
    return c >= 'A' && c <= 'Z';
  }

}
