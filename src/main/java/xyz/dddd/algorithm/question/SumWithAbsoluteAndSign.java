package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/76501">"음양 더하기"</a></h1>
 * <p>· 문제: 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs로 실제 정수를 구해 그 합을
 * 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>absolutes의 길이: 1 이상 1,000 이하</li>
 *   <li>absolutes의 요소: 각각 1 이상 1,000 이하</li>
 *   <li>signs의 길이 == absolutes의 길이</li>
 *   <li>signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수, 그렇지 않으면 음수</li>
 * </ol>
 */
public class SumWithAbsoluteAndSign {

  public int solve(final int[] absolutes, final boolean[] signs) {
    int sum = 0;
    for (int i = 0; i < absolutes.length; i++) {
      sum += convertTo(signs[i]) * absolutes[i];
    }

    return sum;
  }

  private int convertTo(boolean sign) {
    return sign ? 1 : -1;
  }

}
