package xyz.superdev.practice.algorithm;

import java.util.HashSet;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/77884">"약수의 개수와 덧셈"</a></h1>
 * <p>· 문제: left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>1 ≤ left ≤ right ≤ 1,000</li>
 * </ol>
 */
public class CountAndSumDivisor {

    public int solve(final int left, final int right) {
        int sum = 0;
        for (int n = left; n <= right; n++) {
            int divisorCount = countDivisor(n);
            sum += (divisorCount % 2 == 0 ? 1 : -1) * n;
        }

        return sum;
    }

    private int countDivisor(final int number) {
        HashSet<Integer> divisorSet = new HashSet<>();
        for (int n = 1; n <= number; n++) {
            if (number % n > 0) {
                continue;
            }

            int quotient = number / n;
            if (quotient < n) {
                break;
            }

            divisorSet.add(n);
            divisorSet.add(quotient);
        }

        return divisorSet.size();
    }
}
