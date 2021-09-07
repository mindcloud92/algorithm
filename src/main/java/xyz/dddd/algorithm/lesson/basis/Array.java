package xyz.dddd.algorithm.lesson.basis;

public class Array {

  public Array() {
    throw new UnsupportedOperationException();
  }

  public static int maxOf(final int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      if (current > max) {
        max = current;
      }
    }

    return max;
  }

  public static int[] reverse(final int[] array) {
    int[] result = array.clone();
    for (int i = 0; i < array.length / 2; i++) {
      swap(result, i, array.length - i - 1);
    }

    return result;
  }

  private static void swap(final int[] array, int sourceIndex, int targetIndex) {
    int source = array[sourceIndex];

    array[sourceIndex] = array[targetIndex];
    array[targetIndex] = source;
  }
}
