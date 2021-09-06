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
