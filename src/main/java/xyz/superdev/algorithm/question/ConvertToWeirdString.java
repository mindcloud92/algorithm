package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12930">"이상한 문자 만들기"</a></h1>
 * <p>· 문제: 문자열 s의 각 단어를 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단</li>
 *   <li>첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리</li>
 * </ol>
 */
public class ConvertToWeirdString {

  private static final int ALPHABET_TOTAL_COUNT = 32;

  private static final char SPACE_CHARACTER = ' ';

  public String solve(final String s) {
    char[] chars = s.toUpperCase().toCharArray();

    for (int i = 0, wsi = 0; i < chars.length; i++) {
      char current = chars[i];
      if (current == SPACE_CHARACTER) {
        wsi = i + 1;
      } else if ((i - wsi) % 2 > 0) {
        chars[i] = (char) (current + ALPHABET_TOTAL_COUNT);
      }
    }

    return new String(chars);
  }

}
