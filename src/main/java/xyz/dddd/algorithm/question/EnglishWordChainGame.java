package xyz.dddd.algorithm.question;

import java.util.HashSet;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12981">"영어 끝말잇기"</a></h1>
 * <p>· 문제: 사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에
 * 탈락하는지를 배열에 담아 반환</p>
 * <p>· 게임 방법</p>
 * <ol>
 *   <li>1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말한다.</li>
 *   <li>마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작</li>
 *   <li>앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 한다.</li>
 *   <li>이전에 등장했던 단어는 사용 불가</li>
 * </ol>
 * <p>· 조건</p>
 * <ol>
 *   <li>n의 범위: 2 이상 10 이하의 자연수</li>
 *   <li>words: 끝말잇기에 사용한 단어들이 순서대로 들어있는 배열</li>
 *   <li>단어의 길이: 2 이상 50 이하</li>
 *   <li>단어의 구성: 알파벳 소문자</li>
 *   <li>정답 = [번호, 차례] 형태로 반환</li>
 *   <li>주어진 단어들로 탈락자가 생기지 않는다면 [0, 0]을 반환</li>
 * </ol>
 */
public class EnglishWordChainGame {

  public int[] solve(final int n, final String[] words) {
    HashSet<String> expiredWordSet = new HashSet<>();
    expiredWordSet.add(words[0]);

    for (int i = 1; i < words.length; i++) {
      String current = words[i];

      String previous = words[i - 1];
      if (expiredWordSet.contains(current) || !isChainWord(previous, current)) {
        return new int[]{(i % n) + 1, (i / n) + 1};
      }

      expiredWordSet.add(current);
    }

    return new int[]{0, 0};
  }

  private boolean isChainWord(final String previous, final String current) {
    return previous.charAt(previous.length() - 1) == current.charAt(0);
  }

}
