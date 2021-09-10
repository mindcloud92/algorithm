package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12921">"소수 찾기"</a></h1>
 * <p>· 문제: 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>소수: 1과 자기 자신으로만 나누어지는 수(1은 소수가 x)</li>
 *   <li>n의 범위: 2이상 1000000이하의 자연수</li>
 * </ol>
 */
public class PrimeNumberFinder {

  private static final int MIN_PRIME_NUMBER = 2;

  public int solve(final int n) {
    int[] primeNumbers = new int[n];
    int totalCount = 0;

    for (int i = MIN_PRIME_NUMBER; i <= n; i++) {
      if (!isCompositeNumber(primeNumbers, i)) {
        primeNumbers[++totalCount - 1] = i;
      }
    }

    return totalCount;
  }

  private boolean isCompositeNumber(final int[] primeNumbers, final int currentNumber) {
    if (primeNumbers[0] == 0) {
      return false;
    }

    for (int j = 0; primeNumbers[j] * primeNumbers[j] <= currentNumber; j++) {
      if (currentNumber % primeNumbers[j] == 0) {
        return true;
      }
    }

    return false;
  }
}
