package xyz.dddd.algorithm.question.programmers;

import java.util.Scanner;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12969">"직사각형 별 찍기"</a></h1>
 * <p>· 문제: 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>scanner로 두 개의 정수 n과 m을 입력</li>
 * </ol>
 */
public class StarRectanglePrinter {

  private static final String STAR_STRING = "*";

  public void solve() {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    print(n, m);
  }

  private void print(final int horizontalLength, final int verticalLength) {
    String horizontalLine = createHorizontalLine(horizontalLength);
    for (int i = 0; i < verticalLength; i++) {
      System.out.println(horizontalLine);
    }
  }

  private String createHorizontalLine(final int length) {
    StringBuilder horizontalLine = new StringBuilder();
    for (int i = 0; i < length; i++) {
      horizontalLine.append(STAR_STRING);
    }

    return horizontalLine.toString();
  }

}
