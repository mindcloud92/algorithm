package xyz.dddd.algorithm.lesson.lyrics;

import java.util.HashMap;
import java.util.Map;

public class Trie {

  private Map<Character, Trie> children = new HashMap<>();

  private Map<Character, Trie> reversedChildren = new HashMap<>();

  private int totalCount = 0;

  private int reverseTotalCount = 0;

  public void insert(final String word) {
    if (word == null || word.length() == 0) {
      return;
    }

    this.insert(word, false);
    this.insert(new StringBuilder(word).reverse().toString(), true);
  }

  public int matches(final String pattern, final String wildcard) {
    String affix = pattern.replace(wildcard, "");

    return pattern.charAt(0) == wildcard.charAt(0) ? this.endsWith(affix) : this.startsWith(affix);
  }

  public int startsWith(final String prefix) {
    return this.matches(prefix, false);
  }

  public int endsWith(final String suffix) {
    return this.matches(new StringBuilder(suffix).reverse().toString(), true);
  }

  private int matches(final String affix, final boolean isReverse) {
    if (affix == null || affix.length() == 0) {
      return this.getTotalCount(isReverse);
    }

    Trie target = this;
    for (char c : affix.toCharArray()) {
      Trie child = target.getChildren(isReverse).get(c);
      if (child == null) {
        return 0;
      }

      target = child;
    }

    return target.getTotalCount(isReverse);
  }

  private int getTotalCount(boolean isReverse) {
    return isReverse ? this.reverseTotalCount : this.totalCount;
  }

  private void incresaseTotalCount(boolean isReverse) {
    if (isReverse) {
      this.reverseTotalCount++;
    } else {
      this.totalCount++;
    }
  }

  private Map<Character, Trie> getChildren(boolean isReverse) {
    return isReverse ? this.reversedChildren : this.children;
  }

  private void insert(final String word, boolean isReverse) {
    if (word == null || word.length() == 0) {
      return;
    }

    Trie target = this;
    for (char c : word.toCharArray()) {
      target.incresaseTotalCount(isReverse);

      target = target.getChildren(isReverse).computeIfAbsent(c, k -> new Trie());
    }
  }

}
