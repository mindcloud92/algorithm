package xyz.dddd.algorithm.lesson;

public class NumberOfCorrectParentheses {

  private NumberOfCorrectParentheses() {
    throw new UnsupportedOperationException();
  }

  public static int count(final int pairCount) {
    if (pairCount <= 1) {
      return 1;
    }

    int count = 0;
    for (int i = 0; i < pairCount; i++) {
      count += count(i) * count(pairCount - i - 1);
    }

    return count;
  }

}