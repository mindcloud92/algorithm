package xyz.dddd.algorithm.lesson.lyrics;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>가사 검색 - Trie 자료구조</h1>
 * <ul>
 *   <li>
 *     <a href="https://programmers.co.kr/learn/courses/30/lessons/60060">Programmers question</a>
 *   </li>
 *   <li>
 *     <a href="https://ko.wikipedia.org/wiki/%ED%8A%B8%EB%9D%BC%EC%9D%B4_(%EC%BB%B4%ED%93%A8%ED%8C%85)">Wiki: Trie 자료구조</a>
 *   </li>
 * </ul>
 */
public class LyricsSearch {

  private static final String WILDCARD = "?";

  public int matches(final String[] words, final String pattern) {
    Map<Integer, Trie> trieMap = createWordTrieMap(words);

    return this.matches(trieMap, pattern);
  }

  public int[] matches(final String[] words, final String[] patterns) {
    Map<Integer, Trie> trieMap = createWordTrieMap(words);

    int[] result = new int[patterns.length];
    for (int i = 0; i < patterns.length; i++) {
      result[i] = this.matches(trieMap, patterns[i]);
    }

    return result;
  }

  private int matches(final Map<Integer, Trie> trieMap, final String pattern) {
    Trie matchedTrie = trieMap.get(pattern.length());
    if (matchedTrie == null) {
      return 0;
    }

    return matchedTrie.matches(pattern, WILDCARD);
  }

  private Map<Integer, Trie> createWordTrieMap(final String[] words) {
    Map<Integer, Trie> trieMap = new HashMap<>();
    for (String word : words) {
      int key = word.length();

      Trie trie = trieMap.getOrDefault(key, new Trie());
      trie.insert(word);

      trieMap.put(key, trie);
    }

    return trieMap;
  }

}
