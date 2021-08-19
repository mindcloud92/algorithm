package xyz.dddd.algorithm.lesson.lyrics;

import java.util.HashMap;
import java.util.Map;

public class LyricsSearch {

  private static final String WILDCARD = "?";

  public int matches(final String[] words, final String pattern) {
    Map<Integer, Trie> trieMap = createWordTrieMap(words);

    Trie matchedTrie = trieMap.get(pattern.length());
    if (matchedTrie == null) {
      return 0;
    }

    return matchedTrie.matches(pattern, WILDCARD);
  }

  public int[] matches(final String[] words, final String[] patterns) {
    Map<Integer, Trie> trieMap = createWordTrieMap(words);

    int[] result = new int[patterns.length];
    for (int i = 0; i < patterns.length; i++) {
      String pattern = patterns[i];

      Trie matchedTrie = trieMap.get(pattern.length());
      if (matchedTrie == null) {
        continue;
      }

      result[i] = matchedTrie.matches(pattern, WILDCARD);
    }

    return result;
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
