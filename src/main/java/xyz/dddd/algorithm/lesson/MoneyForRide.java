package xyz.dddd.algorithm.lesson;

/**
 * <h1>부족한 금액 계산하기</h1>
 * <ul>
 *   <li>
 *     <a href="https://programmers.co.kr/learn/courses/30/lessons/82612">Programmers question</a>
 *   </li>
 * </ul>
 */
public class MoneyForRide {

  public long calculateInsufficientMoney(final int rideFee, final int money, final int count) {
    long totalRideFee = 0;
    for (int i = 0; i < count; i++) {
      totalRideFee += rideFee * (i + 1);
    }

    return Math.max(totalRideFee - money, 0);
  }

}
