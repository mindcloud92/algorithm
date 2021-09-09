package xyz.dddd.algorithm.lesson.basis;

public class DigitConverter {

  private static final int ZERO_CHARACTER_INT_VALUE = 48;

  private static final int DECIMAL_START_VALUE = 10;

  private static final int A_CHARACTER_INT_VALUE = 65 - DECIMAL_START_VALUE;

  public DigitConverter() {
    throw new UnsupportedOperationException();
  }

  public static int calculateLength(final int decimal, final int radix, char[] digits) {
    int source = decimal;

    int index = digits.length - 1;
    while (source > 0) {
      int remain = source % radix;

      digits[index--] = (char) (remain + (remain >= DECIMAL_START_VALUE ? A_CHARACTER_INT_VALUE : ZERO_CHARACTER_INT_VALUE));
      source /= radix;
    }

    return digits.length - index - 1;
  }

}
