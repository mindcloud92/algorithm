package xyz.dddd.algorithm.lesson;


/**
 * <h1>주식 가격</h1>
 * <ul>
 *   <li>
 *     <a href="https://programmers.co.kr/learn/courses/30/lessons/42584">Programmers question</a>
 *   </li>
 * </ul>
 */

public class StockPrice {

  public int[] countMaintainedSeconds(final int[] prices) {
    int[] maintainedSeconds = new int[prices.length];
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        maintainedSeconds[i]++;

        if (prices[i] > prices[j]) {
          break;
        }
      }
    }

    return maintainedSeconds;
  }

}
