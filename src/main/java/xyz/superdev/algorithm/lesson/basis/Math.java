package xyz.superdev.algorithm.lesson.basis;

@SuppressWarnings("ManualMinMaxCalculation")
public class Math {

  public Math() {
    throw new UnsupportedOperationException();
  }

  public static int max(final int a, final int b, final int c, final int d) {
    return Math.max(max(a, b), c, d);
  }

  public static int max(final int a, final int b, final int c) {
    return max(max(a, b), c);
  }

  public static int max(final int a, final int b) {
    return a > b ? a : b;
  }

  public static int min(final int a, final int b, final int c, final int d) {
    return Math.min(min(a, b), c, d);
  }

  public static int min(final int a, final int b, final int c) {
    return min(min(a, b), c);
  }

  public static int min(final int a, final int b) {
    return a > b ? b : a;
  }

  /**
   * @see "quick sort"
   */
  public static int mid(final int a, final int b, final int c) {
    if (a >= b) {
      return b >= c ? b : Math.min(c, a);
    }

    return a > c ? a : Math.min(c, b);
  }

  public static int sumByRangeOf(final int start, final int end) {
    int sum = 0;

    for (int i = start; i <= end; i++) {
      sum += i;
    }

    return sum;
  }

  /**
   * <a href="https://sgcomputer.tistory.com/272">@link 가우스 덧셈</a>
   */
  public static int sumGaussByRangeOf(final int start, final int end) {
    int sum = (start + end) * (end / 2);

    boolean isOdd = end % 2 > 0;
    if (isOdd) {
      sum += (start + end) / 2;
    }

    return sum;
  }
}
