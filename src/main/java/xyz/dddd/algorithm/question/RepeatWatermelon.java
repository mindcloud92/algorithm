package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12922">"수박수박수박수박수박수?"</a></h1>
 * <p>· 문제: 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 길이 10,000이하인 자연수</li>
 * </ol>
 */
public class RepeatWatermelon {

  public String solve(final int n) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      boolean isEven = i % 2 == 0;

      builder.append(isEven ? "수" : "박");
    }

    return builder.toString();
  }

}
