package xyz.dddd.algorithm.lesson.lyrics;

import java.util.HashMap;
import java.util.Map;

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

