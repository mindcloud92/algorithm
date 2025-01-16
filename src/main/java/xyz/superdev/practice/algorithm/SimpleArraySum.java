package xyz.superdev.practice.algorithm;

import java.util.List;

/**
 * <h3><a href="https://www.hackerrank.com/challenges/simple-array-sum/problem">"Simple
 * Array Sum"</a></h1>
 * <p>· 문제: 정수 배열 요소의 합 반환</p>
 */
public class SimpleArraySum {

    public int solve(final List<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }

        return sum;
    }

}
