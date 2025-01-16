package xyz.superdev.practice.algorithm;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/68935">"3진법 뒤집기"</a></h1>
 * <p>· 문제: 자연수 n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 1 이상 100,000,000 이하인 자연수</li>
 * </ol>
 */
public class ReverseByThreeDigit {

    private static final int RADIX = 3;

    public int solve(int n) {
        StringBuilder reverseTripleString = new StringBuilder();
        while (n > 0) {
            reverseTripleString.append(n % RADIX);
            n /= RADIX;
        }

        return Integer.parseInt(reverseTripleString.toString(), RADIX);
    }

}
