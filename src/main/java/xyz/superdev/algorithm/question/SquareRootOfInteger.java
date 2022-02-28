package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12934">"정수 제곱근 판별"</a></h1>
 * <p>· 문제: n이 양의 정수 x의 제곱이라면 x+1의 제곱을, n이 양의 정수 x의 제곱이 아니라면 -1을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 1이상 50000000000000 이하인 양의 정수</li>
 * </ol>
 */
public class SquareRootOfInteger {

  private static final Integer INVALID_NUMBER = -1;

  public long solve(final long n) {
    long sqrt = sqrt(n);

    return sqrt > 0 ? pow(sqrt + 1, 2) : INVALID_NUMBER;
  }

  private long pow(final long n, int radix) {
    long exponentiation = n;
    while (radix > 1) {
      exponentiation *= n;
      radix--;
    }

    return exponentiation;
  }

  private long sqrt(final long n) {
    long sqrt = 1;
    while (sqrt * sqrt < n) {
      sqrt++;
    }

    return sqrt * sqrt == n ? sqrt : -1;
  }
}
