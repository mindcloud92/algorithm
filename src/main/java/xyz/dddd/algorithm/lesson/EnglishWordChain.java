package xyz.dddd.algorithm.lesson;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>영어 끝말잇기</h1>
 * <ul>
 *   <li>
 *     <a href="https://programmers.co.kr/learn/courses/30/lessons/12981">Programmers question</a>
 *   </li>
 * </ul>
 */
public class EnglishWordChain {

  public int[] findFirstOutInfo(final int peopleCount, final String[] words) {
    Set<String> wordChainSet = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      String currentWord = words[i];
      if (wordChainSet.contains(currentWord) || isNotChain(words, i)) {
        return createOutInfo(i, peopleCount);
      }

      wordChainSet.add(currentWord);
    }

    return new int[2];
  }

  private int[] createOutInfo(final int index, final int peopleCount) {
    int number = (index % peopleCount) + 1;
    int turn = (index / peopleCount) + 1;

    return new int[]{number, turn};
  }

  private boolean isNotChain(final String[] words, final int currentIndex) {
    String currentWord = words[currentIndex];

    return currentIndex > 0 && words[currentIndex - 1].charAt(words[currentIndex - 1].length() - 1) != currentWord.charAt(0);
  }

}
