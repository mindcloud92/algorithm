package xyz.dddd.algorithm.question;

import java.util.TreeSet;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12939">"최댓값과 최솟값"</a></h1>
 * <p>· 문제: 공백으로 구분된 숫자들이 저장되어있는 문자열 s에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>s에는 둘 이상의 정수가 공백으로 구분</li>
 * </ol>
 */
public class MinAndMax {

  public String solve(final String s) {
    TreeSet<Integer> set = convertTo(s);

    return set.first() + " " + set.last();
  }

  private TreeSet<Integer> convertTo(String s) {
    TreeSet<Integer> set = new TreeSet<>();

    String[] splitString = s.split(" ");
    for (String ss : splitString) {
      set.add(Integer.parseInt(ss));
    }

    return set;
  }

}
