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
public class TrieNode {

  private final Map<Character, TrieNode> children = new HashMap<>();

  private int totalCount;

  public void insert(final String word) {
    if (word == null || word.length() == 0) {
      return;
    }

    TrieNode target = this;
    for (char c : word.toCharArray()) {
      target.totalCount++;
      target = target.children.computeIfAbsent(c, k -> new TrieNode());
    }
  }

  public int matches(final String affix) {
    if (affix == null || affix.length() == 0) {
      return this.totalCount;
    }

    TrieNode target = this;
    for (char c : affix.toCharArray()) {
      TrieNode child = target.children.get(c);
      if (child == null) {
        return 0;
      }

      target = child;
    }

    return target.totalCount;
  }
}

