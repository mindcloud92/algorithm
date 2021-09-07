package xyz.dddd.algorithm.lesson.basis;

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

  @SuppressWarnings("ManualMinMaxCalculation")
  public static int max(final int a, final int b) {
    return a > b ? a : b;
  }

  public static int min(final int a, final int b, final int c, final int d) {
    return Math.min(min(a, b), c, d);
  }

  public static int min(final int a, final int b, final int c) {
    return min(min(a, b), c);
  }

  @SuppressWarnings("ManualMinMaxCalculation")
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

  public static int sum(final int continuousNumberCount) {
    return sum(1, continuousNumberCount);
  }

  public static int sum(final int start, final int end) {
    int sum = 0;

    for (int i = start; i <= end; i++) {
      sum += i;
    }

    return sum;
  }

  /**
   * <a href="https://sgcomputer.tistory.com/272">@link 가우스 덧셈</a>
   */
  public static int sumByGauss(final int continuousNumberCount) {
    int sum = (1 + continuousNumberCount) * (continuousNumberCount / 2);

    boolean isEven = continuousNumberCount % 2 == 0;
    if (!isEven) {
      sum += (1 + continuousNumberCount) / 2;
    }

    return sum;
  }
}
