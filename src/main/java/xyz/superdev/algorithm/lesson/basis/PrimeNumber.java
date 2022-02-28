package xyz.superdev.algorithm.lesson.basis;

import java.util.function.BiFunction;

public class PrimeNumber {

  public int[] findWithWorstPerformance(final int start, final int end) {
    BiFunction<Integer, int[], Boolean> isCompositeFunction = (currentNumber, primeNumbers) -> {
      boolean isCompositeNumber = false;
      for (int pn = java.lang.Math.max(start, 2); pn < currentNumber; pn++) {
        if (currentNumber % pn == 0) {
          isCompositeNumber = true;
          break;
        }
      }

      return isCompositeNumber;
    };

    return find(start, end, isCompositeFunction);
  }

  public int[] findWithSoSoPerformance(final int start, final int end) {
    BiFunction<Integer, int[], Boolean> isCompositeFunction = (currentNumber, primeNumbers) -> {
      boolean isCompositeNumber = false;
      for (int pi = 0; pi < primeNumbers.length; pi++) {
        if (primeNumbers[pi] > 0 && currentNumber % primeNumbers[pi] == 0) {
          isCompositeNumber = true;
          break;
        }
      }

      return isCompositeNumber;
    };

    return find(start, end, isCompositeFunction);
  }

  public int[] findWithBestPerformance(final int start, final int end) {
    BiFunction<Integer, int[], Boolean> isCompositeFunction = (currentNumber, primeNumbers) -> {
      boolean isCompositeNumber = false;
      if (primeNumbers[0] <= 0) {
        return false;
      }

      for (int pi = 0; primeNumbers[pi] * primeNumbers[pi] <= currentNumber; pi++) {
        if (currentNumber % primeNumbers[pi] == 0) {
          isCompositeNumber = true;
          break;
        }
      }

      return isCompositeNumber;
    };

    return find(start, end, isCompositeFunction);
  }

  private int[] find(final int start, final int end,
      final BiFunction<Integer, int[], Boolean> isCompositeFunction) {
    int[] primeNumbers = new int[end];
    int totalCount = 0;

    for (int n = java.lang.Math.max(start, 2); n <= end; n++) {
      if (!isCompositeFunction.apply(n, primeNumbers)) {
        primeNumbers[++totalCount - 1] = n;
      }
    }

    return slice(primeNumbers, totalCount - 1);
  }

  private int[] slice(final int[] array, final int endIndex) {
    int[] result = new int[endIndex + 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

}
