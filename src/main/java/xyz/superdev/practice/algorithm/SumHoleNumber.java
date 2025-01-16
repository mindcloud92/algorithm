package xyz.superdev.practice.algorithm;

import java.util.HashSet;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/86051">"없는 숫자 더하기"</a></h1>
 * <p>· 문제: 0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>numbers의 길이: 0이상 9 이하</li>
 *   <li>numbers의 원소: 0이상 9 이하인 정수</li>
 *   <li>numbers의 모든 수는 서로 다름</li>
 * </ol>
 */
public class SumHoleNumber {

    private final static int MAX_NUMBER = 10;

    public int solve(final int[] numbers) {
        HashSet<Integer> criteriaSet = createCriteriaSet();
        for (int current : numbers) {
            criteriaSet.remove(current);
        }

        return sum(criteriaSet);
    }

    private HashSet<Integer> createCriteriaSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < MAX_NUMBER; i++) {
            set.add(i);
        }

        return set;
    }

    private int sum(final HashSet<Integer> set) {
        if (set.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }

        return sum;
    }
}
