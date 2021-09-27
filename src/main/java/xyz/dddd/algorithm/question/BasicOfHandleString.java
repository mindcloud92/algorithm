package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12918">"문자열 다루기 기본"</a></h1>
 * <p>· 문제: 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 여부 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>s 길이: 1 이상, 8 이하</li>
 * </ol>
 */
public class BasicOfHandleString {

  private static final String NUMBER_REGEX = "^[0-9]+$";

  public boolean solve(final String s) {
    int length = s.length();

    return (length == 4 || length == 6) && s.matches(NUMBER_REGEX);
  }

}
