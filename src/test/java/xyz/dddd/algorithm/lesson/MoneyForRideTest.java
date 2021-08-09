package xyz.dddd.algorithm.lesson;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyForRideTest {

  private static MoneyForRide moneyForRide;

  @BeforeAll
  public static void setUp() {
    moneyForRide = new MoneyForRide();
  }

  @Test
  public void givenRideInfoWhenCalculateInsufficientMoneyThen() {
    int rideFee = 3;

    int money = 20;
    int count = 4;

    long actual = moneyForRide.calculateInsufficientMoney(rideFee, money, count);

    long expected = 10L;
    assertEquals(expected, actual);
  }
}
