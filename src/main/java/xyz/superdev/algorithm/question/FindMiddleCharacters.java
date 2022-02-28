package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12903">"가운데 글자 가져오기"</a></h1>
 * <p>· 문제: 단어 s의 가운데 글자를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>s의 길이: 1 이상, 100이하</li>
 * </ol>
 */
public class FindMiddleCharacters {

  public String solve(String s) {
    int length = s.length();

    int criteriaIndex = length / 2;
    return s.substring(criteriaIndex - 1 + (length % 2), criteriaIndex + 1);
  }

}
