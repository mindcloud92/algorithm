package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12954">"x만큼 간격이 있는 n개의
 * 숫자"</a></h1>
 * <p>· 문제: x부터 시작해 x씩 증가하는 숫자를 n개 지니는 배열을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>x의 범위: -10000000 이상, 10000000 이하인 정수</li>
 *   <li>n의 범위: 1000 이하인 자연수</li>
 * </ol>
 */
public class NumberArrayBySpaced {

  public long[] solve(final int x, final int n) {
    long[] answer = new long[n];

    answer[0] = x;
    for (int i = 1; i < answer.length; i++) {
      answer[i] = answer[i - 1] + x;
    }

    return answer;
  }

}
