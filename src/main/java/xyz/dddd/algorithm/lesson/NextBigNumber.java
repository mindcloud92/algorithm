package xyz.dddd.algorithm.lesson;

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
