package xyz.dddd.algorithm.question;

import java.util.Map;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/81301">"숫자 문자열과 영단어"</a></h1>
 * <p>· 문제: 숫자의 일부가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 의미하는 원래 숫자를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>s의 길이: 1 이상 50 이하</li>
 *   <li>s가 "zero" 또는 "0"으로 시작하는 경우는 x</li>
 *   <li>s가 될 수 있는 정수의 범위: 1 이상 2,000,000,000 이하</li>
 * </ol>
 */
public class NumberStringAndEnglishWord {

  private static final Map<String, String> NUMBER_MAP = Map.of(
      "zero", "0",
      "one", "1",
      "two", "2",
      "three", "3",
      "four", "4",
      "five", "5",
      "six", "6",
      "seven", "7",
      "eight", "8",
      "nine", "9"
  );


  public int solve(final String s) {
    String convertedString = s;
    for (String key : NUMBER_MAP.keySet()) {
      convertedString = convertedString.replace(key, NUMBER_MAP.get(key));
    }

    return Integer.parseInt(convertedString);
  }

}
