package xyz.superdev.practice.algorithm;

import java.util.TreeSet;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12935">"제일 작은 수 제거하기"</a></h1>
 * <p>· 문제</p>
 * <ol>
 *   <li>정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 반환</li>
 *   <li>반환하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 반환</li>
 * </ol>
 * <p>· 조건</p>
 * <ol>
 *   <li>arr의 길이: 1 이상</li>
 *   <li>인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] </li>
 * </ol>
 */
public class RemoveMinNumber {

    public int[] solve(final int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        return removeMinimumValue(arr);
    }

    private int[] removeMinimumValue(final int[] arr) {
        int[] result = new int[arr.length - 1];

        int minimumValue = getMinimumValue(arr);
        for (int i = 0, si = 0; i < arr.length; i++) {
            if (arr[i] != minimumValue) {
                result[si] = arr[i];
                si++;
            }
        }

        return result;
    }

    private int getMinimumValue(final int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int j : arr) {
            set.add(j);
        }

        return set.first();
    }

}
