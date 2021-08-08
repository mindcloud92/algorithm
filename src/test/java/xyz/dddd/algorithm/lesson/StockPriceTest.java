package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StockPriceTest {

  private static StockPrice stockPrice;

  @BeforeAll
  public static void setUp() {
    stockPrice = new StockPrice();
  }

  @Test
  public void givenPricePerSecondsWhenCountMaintainedSecondsThen() {
    int[] prices = {1, 2, 3, 2, 3};

    int[] actual = stockPrice.countMaintainedSeconds(prices);

    int[] expected = {4, 3, 1, 1, 0};
    assertArrayEquals(expected, actual);
  }
}
