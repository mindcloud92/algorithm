package xyz.dddd.algorithm.lesson;

import java.util.HashMap;

public class LyricsSearch {

  private static final char WILDCARD_CHARACTER = '?';

  public int[] matches(final String[] words, final String[] patterns) {
    HashMap<String, Integer> pairs = new HashMap<>();

    int[] result = new int[patterns.length];
    for (int i = 0; i < patterns.length; i++) {
      String pattern = patterns[i];
      if (pairs.containsKey(pattern)) {
        result[i] = pairs.get(pattern);
        continue;
      }

      result[i] = match(words, pattern);
      pairs.put(pattern, result[i]);
    }

    return result;
  }

  public int match(final String[] words, final String pattern) {
    int result = 0;

    for (String word : words) {
      if (isMatch(word, pattern)) {
        result++;
      }
    }

    return result;
  }

  public boolean isMatch(final String word, final String pattern) {
    if (word.length() != pattern.length()) {
      return false;
    }

    boolean isSuffixPattern = pattern.charAt(0) == WILDCARD_CHARACTER;
    return isSuffixPattern ? isEndsWith(word, pattern) : isStartsWith(word, pattern);
  }

  private boolean isStartsWith(final String word, final String pattern) {
    for (int i = 0; i < word.length(); i++) {
      if (pattern.charAt(i) == WILDCARD_CHARACTER) {
        break;
      }

      if (word.charAt(i) != pattern.charAt(i)) {
        return false;
      }
    }

    return true;
  }

  private boolean isEndsWith(final String word, final String pattern) {
    for (int i = word.length() - 1; i >= 0; i--) {
      if (pattern.charAt(i) == WILDCARD_CHARACTER) {
        break;
      }

      if (word.charAt(i) != pattern.charAt(i)) {
        return false;
      }
    }

    return true;
  }

}
