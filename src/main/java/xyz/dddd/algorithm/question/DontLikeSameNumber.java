package xyz.dddd.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12906">"같은 숫자는 싫어"</a></h1>
 * <p>· 문제: 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거한 배열 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>배열 arr의 길이 : 1,000,000 이하</li>
 *   <li>arr 원소의 범위 : 0이상 9이하인 정수</li>
 * </ol>
 */
public class DontLikeSameNumber {

  private static final int INVALID_NUMBER = -1;

  public int[] solve(final int[] arr) {
    int actualSize = 1;
    int compareValue = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (compareValue == arr[i]) {
        arr[i] = INVALID_NUMBER;
        continue;
      }

      compareValue = arr[i];
      actualSize++;
    }

    return correct(arr, actualSize);
  }

  private int[] correct(final int[] target, final int size) {
    int[] result = new int[size];
    for (int i = 0, ri = 0; i < target.length; i++) {
      if (target[i] == INVALID_NUMBER) {
        continue;
      }

      result[ri] = target[i];
      ri++;
    }

    return result;
  }
}
