package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12951">"JadenCase 문자열
 * 만들기"</a></h1>
 * <p>· 문제: 문자열 s를 JadenCase로 바꾼 문자열을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>JadenCase = 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열</li>
 *   <li>s의 길이: 1 이상</li>
 *   <li>s의 구성: 알파벳 + 공백문자(" ")</li>
 *   <li>첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로</li>
 * </ol>
 */
public class ConvertToJadenCase {

  private static final char SPACE_CHARACTER = ' ';

  private static final int ALPHABET_TOTAL_COUNT = 32;

  public String solve(final String s) {
    char[] chars = s.toLowerCase().toCharArray();
    for (int i = 0, wsi = 0; i < chars.length; i++) {
      char current = chars[i];
      if (current == SPACE_CHARACTER) {
        wsi = i + 1;
      } else if (i == wsi && isLowerCase(current)) {
        chars[i] = (char) (current - ALPHABET_TOTAL_COUNT);
      }
    }

    return new String(chars);
  }

  private boolean isLowerCase(final char c) {
    return c >= 'a' && c <= 'z';
  }

}
