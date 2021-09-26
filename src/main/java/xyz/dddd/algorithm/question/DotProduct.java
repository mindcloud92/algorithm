package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/70128">"내적"</a></h1>
 * <p>· 문제: a와 b의 <a href="https://en.wikipedia.org/wiki/Dot_product">내적</a>을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>a, b의 길이: 1 이상 1,000 이하</li>
 *   <li>a, b의 원소: -1,000 이상 1,000 이하</li>
 * </ol>
 */
public class DotProduct {

  public int solve(final int[] a, final int[] b) {
    int answer = 0;
    for (int i = 0; i < a.length; i++) {
      answer += a[i] * b[i];
    }

    return answer;
  }

}
