package Vorlesung;

public class Trie {
    private final TrieNode root = new TrieNode();

    public void add(String word){
        root.add(word);
    }

    public int getPrefixCount(String prefix){
        return root.getPrefixCount(prefix);
    }

    public int getWordCount(String word){
        return root.getWordCount(word);
    }

    public static void main(String [] args){
        Trie myFirstTrie = new Trie();
        myFirstTrie.add("meinErsterBaum");
        myFirstTrie.add("meinZweiterBaum");
        myFirstTrie.add("deinErsterBaum");
        myFirstTrie.add("deinZweiterBaum");
        System.out.println(myFirstTrie.getPrefixCount("mein"));
        System.out.println(myFirstTrie.getPrefixCount("sein"));
        System.out.println(myFirstTrie.getWordCount("meinErsterBaum"));
        myFirstTrie.add("meinErsterBaum");
        System.out.println(myFirstTrie.getWordCount("meinErsterBaum"));
    }
}
