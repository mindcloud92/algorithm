package xyz.dddd.algorithm.lesson.basis;

public class Array {

  public Array() {
    throw new UnsupportedOperationException();
  }

  public static int linearSearch(final int[] arr, final int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }

    return -1;
  }

  public static int binarySearch(final int[] arr, final int key) {
    int startIndex = 0;
    int endIndex = arr.length - 1;

    while (startIndex <= endIndex) {
      int centerIndex = (startIndex + endIndex) / 2;

      int criteriaValue = arr[centerIndex];
      if (criteriaValue == key) {
        return centerIndex;
      }

      if (criteriaValue > key) {
        endIndex = centerIndex - 1;
      } else {
        startIndex = centerIndex + 1;
      }
    }

    return -1;
  }

  public static int sentinelSearch(final int[] arr, final int key) {
    int[] clonedArray = Array.copy(arr, new int[arr.length + 1]);
    clonedArray[arr.length] = key;

    int index = 0;
    for (index = 0; clonedArray[index] != key; index++) ;

    return index == arr.length ? -1 : index;
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

  public static int sumOf(final int[] array) {
    int sum = 0;

    for (int j : array) {
      sum += j;
    }

    return sum;
  }

  private static void swap(final int[] array, int sourceIndex, int targetIndex) {
    int source = array[sourceIndex];

    array[sourceIndex] = array[targetIndex];
    array[targetIndex] = source;
  }

  public static boolean equals(final int[] array, final int[] compareTarget) {
    if (array.length != compareTarget.length) {
      return false;
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] != compareTarget[i]) {
        return false;
      }
    }

    return true;
  }

  @SuppressWarnings("ManualArrayCopy")
  public static int[] copy(final int[] source, final int[] target) {
    int[] result = target.clone();

    int length = Math.min(source.length, target.length);
    for (int i = 0; i < length; i++) {
      result[i] = source[i];
    }

    return result;
  }

  public static int[] reverseCopy(final int[] source, final int[] target) {
    int[] result = target.clone();

    int length = Math.min(source.length, target.length);
    for (int i = 0; i < length; i++) {
      result[i] = source[source.length - i - 1];
    }

    return result;
  }
}
