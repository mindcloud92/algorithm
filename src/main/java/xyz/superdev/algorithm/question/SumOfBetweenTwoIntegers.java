package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12912">"두 정수 사이의 합"</a></h1>
 * <p>· 문제 - 정수 a와 b 사이에 속한 모든 정의 합 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>a와 b가 같은 경우 아무 값이나 반환</li>
 *   <li>a와 b의 범위: -10,000,000 이상 10,000,000 이하</li>
 *   <li>a와 b의 대소관계는 정해져있지 않음</li>
 * </ol>
 */
public class SumOfBetweenTwoIntegers {

  public long solve(final int a, final int b) {
    return a > b ? sumByRangeOf(b, a) : sumByRangeOf(a, b);
  }

  public long solveByGauss(final int a, final int b) {
    return a > b ? sumGaussByRangeOf(b, a) : sumGaussByRangeOf(a, b);
  }

  private long sumByRangeOf(final int start, final int end) {
    long sum = start;
    for (int i = start + 1; i <= end; i++) {
      sum += i;
    }

    return sum;
  }

  private long sumGaussByRangeOf(final int start, final int end) {
    long count = end - start + 1;
    if (count <= 1) {
      return start;
    }

    long sum = (start + end) * (count / 2);
    boolean isOdd = count % 2 > 0;
    if (isOdd) {
      sum += (start + end) / 2;
    }

    return sum;
  }
}
