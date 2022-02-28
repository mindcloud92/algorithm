package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://www.hackerrank.com/challenges/staircase/problem">"Staircase"</a></h1>
 * <p>· 문제: # 기호와 공백을 사용해서 계단모양을 출력</p>
 * <p>· 예시: n이 4인 경우</p>
 * <code>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;#</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;##</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp;###</p>
 * <p>&nbsp;&nbsp;&nbsp;####</p>
 * </code>
 */
public class Staircase {

  private static final String STAIR_EXPRESSION = "#";
  private static final String EMPTY_EXPRESSION = " ";

  public void solve(final int n) {
    for (int i = 1; i < n + 1; i++) {
      System.out.printf("%s%s\n", EMPTY_EXPRESSION.repeat(n - i), STAIR_EXPRESSION.repeat(i));
    }
  }

}
