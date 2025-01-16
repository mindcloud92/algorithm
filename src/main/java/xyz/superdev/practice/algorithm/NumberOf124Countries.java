package xyz.superdev.practice.algorithm;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12899">"124 나라의 숫자"</a></h1>
 * <p>· 문제: 자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용</li>
 *   <li>n의 범위: 500,000,000이하의 자연수</li>
 * </ol>
 */

public class NumberOf124Countries {

    private static final String[] REMAINDERS = {"1", "2", "4"};

    public String solve(int n) {
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            n -= 1;

            builder.insert(0, REMAINDERS[n % 3]);
            n /= 3;
        }

        return builder.toString();
    }

}
