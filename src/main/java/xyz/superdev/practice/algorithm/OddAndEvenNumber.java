package xyz.superdev.practice.algorithm;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12937">"짝수와 홀수"</a></h1>
 * <p>· 문제: 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>num: int 범위의 정수</li>
 *   <li>0은 짝수로 판단</li>
 * </ol>
 */
public class OddAndEvenNumber {

    private static final String ODD_STRING = "Odd";
    private static final String EVEN_STRING = "Even";

    public String solve(final int num) {
        return num % 2 == 0 ? EVEN_STRING : ODD_STRING;
    }

}
