package xyz.superdev.algorithm.question;

import java.util.TreeSet;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12910">"나누어 떨어지는 숫자 배열"</a></h1>
 * <p>· 문제</p>
 * <ol>
 *   <li>array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환</li>
 *   <li>divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환</li>
 * </ol>
 * <p>· 조건</p>
 * <ol>
 *   <li>arr의 원소: 자연수</li>
 *   <li>정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j]</li>
 *   <li>divisor: 자연수</li>
 *   <li>array의 길이: 1 이상</li>
 * </ol>
 */
public class ZeroRemainderNumberArray {

  public int[] solve(final int[] arr, final int divisor) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int j : arr) {
      if (j % divisor == 0) {
        set.add(j);
      }
    }

    return convertTo(set);
  }

  private int[] convertTo(final TreeSet<Integer> set) {
    if (set.isEmpty()) {
      return new int[]{-1};
    }

    int[] result = new int[set.size()];

    int i = 0;
    for (Integer integer : set) {
      result[i] = integer;
      i++;
    }

    return result;
  }

}
