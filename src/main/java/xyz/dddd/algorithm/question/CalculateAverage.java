package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12944">"평균 구하기"</a></h1>
 * <p>· 문제: 정수를 담고 있는 배열 arr의 평균값 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>arr 길이: 1 이상, 100 이하</li>
 *   <li>arr의 원소: -10,000 이상 10,000 이하인 정수</li>
 * </ol>
 */
public class CalculateAverage {

  public double solve(int[] arr) {
    double sum = 0;
    for (int j : arr) {
      sum += j;
    }

    return sum / arr.length;
  }
}