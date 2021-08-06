package xyz.dddd.algorithm.lesson;


/**
 * <h1>Catalan number algorithm</h1>
 * <ul>
 *   <li>
 *     <a href="https://namu.wiki/w/%EC%B9%B4%ED%83%88%EB%9E%91%20%EC%88%98?from=%EC%B9%B4%ED%83%88%EB%9E%80%20%EC%88%98">Wiki</a>
 *   </li>
 * </ul>
 */
public class CorrectParentheses {

  public int count(final int pairCount) {
    if (pairCount <= 1) {
      return 1;
    }

    int count = 0;
    for (int i = 0; i < pairCount; i++) {
      count += count(i) * count(pairCount - i - 1);
    }

    return count;
  }

}