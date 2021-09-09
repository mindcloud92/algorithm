package xyz.dddd.algorithm.question.programmers;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/68935">"3진법 뒤집기"</a></h1>
 * <p>· 문제: 자연수 n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 1 이상 100,000,000 이하인 자연수</li>
 * </ol>
 */
public class ReverseTripleString {

  private static final int RADIX = 3;

  public int solution(int decimal) {
    StringBuilder reverseTripleString = new StringBuilder();
    while (decimal > 0) {
      reverseTripleString.append(decimal % RADIX);
      decimal /= RADIX;
    }

    return Integer.parseInt(reverseTripleString.toString(), RADIX);
  }

}
