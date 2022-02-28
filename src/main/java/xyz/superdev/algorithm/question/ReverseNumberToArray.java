package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12932">"자연수 뒤집어 배열로
 * 만들기"</a></h1>
 * <p>· 문제: 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 10,000,000,000 이하</li>
 * </ol>
 */
public class ReverseNumberToArray {

  private static final int ZERO_CHARACTER_INT_VALUE = 48;

  public int[] solve(final long n) {
    String str = n + "";

    int[] result = new int[str.length()];
    for (int i = 0; i < result.length; i++) {
      result[i] = str.charAt(result.length - i - 1) - ZERO_CHARACTER_INT_VALUE;
    }

    return result;
  }

}
