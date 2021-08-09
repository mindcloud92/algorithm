package xyz.dddd.algorithm.lesson;

/**
 * <h1>다음 큰 숫자</h1>
 * <ul>
 *   <li>
 *     <a href="https://programmers.co.kr/learn/courses/30/lessons/12911">Programmers question</a>
 *   </li>
 * </ul>
 */
public class NextBigNumber {

  public int than(final int decimalNumber) {
    int criteriaOneCount = Integer.bitCount(decimalNumber);

    int nextNumber = decimalNumber;
    while (true) {
      if (criteriaOneCount == Integer.bitCount(++nextNumber)) {
        break;
      }
    }

    return nextNumber;
  }

}
