package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/17687">"[3차] n진수 게임"</a></h1>
 * <p>· 문제: 10진수를 n진법으로 변환한 문자열을 게임 참가자 m명이 번갈아 한글자씩 이야기 하는 게임에서 튜브가 말한 문자들을 이어서 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>n: 진법</li>
 *   <li>t: 튜브가 말한 횟수</li>
 *   <li>m: 게임 참가 인원수</li>
 *   <li>p: 튜브의 순서</li>
 *   <li>튜브가 말해야 하는 숫자 t개를 공백 없이 차례대로 나타내야하며 10~15는 각각 대문자 A~F로 표현</li>
 * </ol>
 */
public class DigitGame {

  private static final int A_ASCII_INT_VALUE = 55;

  private static final int ZERO_ASCII_INT_VALUE = 48;

  public String solve(final int n, final int t, final int m, final int p) {
    StringBuilder result = new StringBuilder();

    String digits = concatenateDigit(n, m * t);
    for (int i = p - 1; i < digits.length(); i += m) {
      result.append(digits.charAt(i));
    }

    return result.toString();
  }

  private String concatenateDigit(final int radix, final int length) {
    StringBuilder result = new StringBuilder();

    int number = 0;
    while (length > result.length()) {
      result.append(toDigit(radix, number));
      number++;
    }

    return result.toString();
  }

  private String toDigit(final int radix, final int decimal) {
    if (decimal == 0) {
      return "0";
    }

    int quotient = decimal;

    StringBuilder digit = new StringBuilder();
    while (quotient > 0) {
      int remain = quotient % radix;
      digit.insert(0, convertToRadixChar(remain));

      quotient /= radix;
    }

    return digit.toString();
  }

  private char convertToRadixChar(final int number) {
    int criteriaIntValue = number < 10 ? ZERO_ASCII_INT_VALUE : A_ASCII_INT_VALUE;

    return (char) (number + criteriaIntValue);
  }

}
