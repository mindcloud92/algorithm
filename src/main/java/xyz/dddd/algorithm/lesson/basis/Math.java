package xyz.dddd.algorithm.lesson.basis;

public class Math {

  public Math() {
    throw new UnsupportedOperationException();
  }

  public static int max(final int a, final int b, final int c, final int d) {
    int max = a;
    if (b > max) {
      max = b;
    }

    return Math.max(max, c, d);
  }

  public static int max(final int a, final int b, final int c) {
    int max = a;
    if (b > max) {
      max = b;
    }

    if (c > max) {
      max = c;
    }

    return max;
  }

  public static int min(final int a, final int b, final int c, final int d) {
    int min = a;
    if (b < min) {
      min = b;
    }

    return Math.min(min, c, d);
  }

  public static int min(final int a, final int b, final int c) {
    int min = a;
    if (b < min) {
      min = b;
    }

    if (c < min) {
      min = c;
    }

    return min;
  }

  /**
   * @see "quick sort"
   */
  public static int mid(final int a, final int b, final int c) {
    if (a >= b) {
      return b >= c ? b : java.lang.Math.min(c, a);
    }

    return a > c ? a : java.lang.Math.min(c, b);
  }
}
