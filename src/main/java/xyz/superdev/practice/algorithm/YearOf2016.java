package xyz.superdev.practice.algorithm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12901">"2016년"</a></h1>
 * <p>· 문제: 아 2016년 a월 b일이 무슨 요일인지 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>요일의 이름: 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT</li>
 *   <li>2016년은 윤년</li>
 *   <li>2016년 a월 b일은 실제로 있는 날</li>
 * </ol>
 */
public class YearOf2016 {

    private static final int CRITERIA_YEAR = 2016;

    private static final String DAY_FORMAT = "E";

    public String solve(final int a, final int b) {
        return LocalDate.of(CRITERIA_YEAR, a, b)
                .format(DateTimeFormatter.ofPattern(DAY_FORMAT, Locale.ENGLISH))
                .toUpperCase();
    }

}
