package xyz.superdev.practice.algorithm;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/70129">"이진 변환 반복하기"</a></h1>
 * <p>· 문제: 0과 1로 이루어진 문자열 s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각
 * 배열에 담아 반환</p>
 * <p>· 이진 변환 방법</p>
 * <ol>
 *   <li>s의 모든 0을 제거</li>
 *   <li>s의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 변환</li>
 * </ol>
 * 배열에 담아 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 길이 10,000이하인 자연수</li>
 * </ol>
 */
public class RepeatBinaryConvert {

    private static final String END_STRING = "1";

    private static final int BINARY_RADIX = 2;

    public int[] solve(final String s) {
        String binaryString = s;

        int conversionCount = 0;
        int removedZeroCount = 0;
        while (!binaryString.equals(END_STRING)) {
            String nextBinaryString = binaryString.replace("0", "");
            removedZeroCount += binaryString.length() - nextBinaryString.length();

            binaryString = toBinaryString(nextBinaryString.length());
            conversionCount++;
        }

        return new int[]{conversionCount, removedZeroCount};
    }

    private String toBinaryString(final int decimal) {
        int quotient = decimal;

        StringBuilder builder = new StringBuilder();
        while (quotient > 0) {
            builder.insert(0, quotient % BINARY_RADIX);
            quotient /= BINARY_RADIX;
        }

        return builder.toString();
    }

}
