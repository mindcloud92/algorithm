package xyz.dddd.algorithm.lesson.lyrics;

public class Trie {

  private final TrieNode root = new TrieNode();

  private final TrieNode reverseRoot = new TrieNode();

  public void insert(final String word) {
    if (word == null || word.length() == 0) {
      return;
    }

    root.insert(word);
    reverseRoot.insert(new StringBuilder(word).reverse().toString());
  }

  public int matches(final String pattern, final String wildcard) {
    String affix = pattern.replace(wildcard, "");

    return pattern.charAt(0) == wildcard.charAt(0) ? this.endsWith(affix) : this.startsWith(affix);
  }

  public int startsWith(final String prefix) {
    return this.root.matches(prefix);
  }

  public int endsWith(final String suffix) {
    return this.reverseRoot.matches(new StringBuilder(suffix).reverse().toString());
  }

}
