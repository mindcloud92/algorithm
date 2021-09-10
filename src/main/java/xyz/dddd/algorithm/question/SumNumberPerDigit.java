package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12931">"자릿수 더하기"</a></h1>
 * <p>· 문제 - 자연수 n의 각 자릿수의 합 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 100,000,000 이하의 자연수</li>
 * </ol>
 */
public class SumNumberPerDigit {

  private static final int DECIMAL_RADIX = 10;

  public int solve(int number) {
    int result = 0;
    while (number > 0) {
      result += number % DECIMAL_RADIX;
      number /= DECIMAL_RADIX;
    }

    return result;
  }
}
