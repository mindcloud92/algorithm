package xyz.superdev.practice.algorithm;

/**
 * <h3><a href="https://www.hackerrank.com/challenges/time-conversion/problem">"Time
 * Conversion"</a></h1>
 * <p>· 문제: AM/PM 포맷의 시간 문자열 s를 24시간 포맷으로 변경한 문자열을 반환</p>
 */
public class TimeConversion {

    private static final String PM_FORMAT_SUFFIX = "PM";

    private static final String TIME_DELIMITER = ":";

    public String solve(final String s) {
        String formatSuffix = s.substring(s.length() - 2);

        boolean isPMFormat = PM_FORMAT_SUFFIX.equals(formatSuffix);
        return adjust(s.replace(formatSuffix, ""), isPMFormat ? 12 : -12);
    }

    private String adjust(final String formattedTime, final int adjustHour) {
        String[] times = formattedTime.split(TIME_DELIMITER);

        int hour = Integer.parseInt(times[0]) + adjustHour;
        if (hour == 0) {
            times[0] = "00";
        } else if (hour == 24) {
            times[0] = "12";
        } else if (hour > 12) {
            times[0] = String.valueOf(hour);
        }

        return String.join(TIME_DELIMITER, times);
    }
}
