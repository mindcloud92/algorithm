package xyz.dddd.algorithm.lesson;

public class NextBigNumber {

  public int than(final int decimalNumber) {
    int criteriaOneCount = countOneBinaryString(decimalNumber);

    int nextNumber = decimalNumber;
    while (true) {
      if (criteriaOneCount == countOneBinaryString(++nextNumber)) {
        break;
      }
    }

    return nextNumber;
  }

  private int countOneBinaryString(final int decimalNumber) {
    int n = decimalNumber;

    int count = 0;
    while (n > 0) {
      if (n % 2 == 1) {
        count++;
      }

      n /= 2;
    }

    return count;
  }

}
