package xyz.superdev.algorithm.lesson.basis;

public class DigitConverter {

  private static final int ZERO_CHARACTER_INT_VALUE = 48;

  private static final int DECIMAL_START_VALUE = 10;

  private static final int A_CHARACTER_INT_VALUE = 65 - DECIMAL_START_VALUE;

  public DigitConverter() {
    throw new UnsupportedOperationException();
  }

  public static int calculateLength(final int decimal, final int radix, char[] digits) {
    int source = decimal;

    int length = 0;
    while (source > 0) {
      int remain = source % radix;

      digits[length++] = convertToChar(remain);
      source /= radix;
    }

    return length;
  }

  private static char convertToChar(final int remain) {
    int correspondASCIIValue =
        remain >= DECIMAL_START_VALUE ? A_CHARACTER_INT_VALUE : ZERO_CHARACTER_INT_VALUE;

    return (char) (remain + correspondASCIIValue);
  }
}
