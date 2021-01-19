package Versuche;

import java.util.Collection;

public interface Trie extends Collection {
    public void add(String word);
    public int getPrefixCount(String prefix);
    public int getWordCount(String word);
}
