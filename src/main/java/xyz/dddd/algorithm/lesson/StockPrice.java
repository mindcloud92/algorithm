package xyz.dddd.algorithm.lesson;

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
