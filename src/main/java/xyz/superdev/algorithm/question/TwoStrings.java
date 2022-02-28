package xyz.superdev.algorithm.question;

import java.util.HashSet;

/**
 * <h3><a href="https://www.hackerrank.com/challenges/two-strings/problem">"Two Strings"</a></h1>
 * <p>· 문제: 두개의 문자열 s1와 s2가 같은 문자를 가지고 있으면 "YES"를 그렇지 않으면 "NO"를 반환</p>
 */
public class TwoStrings {

  public String solve(final String s1, final String s2) {
    HashSet<Character> set = new HashSet<>();
    for (char c : s1.toCharArray()) {
      set.add(c);
    }

    for (char c : s2.toCharArray()) {
      if (set.contains(c)) {
        return "YES";
      }
    }

    return "NO";
  }
}
