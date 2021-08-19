package xyz.dddd.algorithm.lesson.lyrics;

import java.util.TreeSet;

public class LyricsSearch {

  private static final String WILDCARD = "?";

  public int matches(final String[] words, final String pattern) {
    Trie[] tries = createWordTrieArray(words);

    int rootIndex = pattern.length() - 1;
    return tries[rootIndex].matches(pattern, WILDCARD);
  }

  public int[] matches(final String[] words, final String[] patterns) {
    Trie[] tries = createWordTrieArray(words);

    int[] result = new int[patterns.length];
    for (int i = 0; i < patterns.length; i++) {
      String pattern = patterns[i];

      int rootIndex = pattern.length() - 1;
      if (rootIndex > tries.length - 1 || tries[rootIndex] == null) {
        continue;
      }

      result[i] = tries[rootIndex].matches(pattern, WILDCARD);
    }

    return result;
  }

  private Trie[] createWordTrieArray(final String[] words) {
    int size = getLongestWordLength(words);

    Trie[] tries = new Trie[size];
    for (String word : words) {
      int index = word.length() - 1;
      if (tries[index] == null) {
        tries[index] = new Trie();
      }

      tries[index].insert(word);
    }

    return tries;
  }

  private int getLongestWordLength(final String[] words) {
    TreeSet<Integer> set = new TreeSet<>();
    for (String s : words) {
      set.add(s.length());
    }

    return set.last();
  }

}
