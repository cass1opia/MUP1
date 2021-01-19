package Vorlesung;

import java.util.Map;
import java.util.TreeMap;

public class TrieNode {
    private final Map<Character, TrieNode> successors = new TreeMap<>();
    private int prefixCount = 0, wordCount = 0;


    public TrieNode(){
    }

    public void add(String word){
        prefixCount ++;
        if(word.isEmpty()) wordCount ++;
        else {
            Character currentChar = word.charAt(0);
            TrieNode trieNode = successors.get(currentChar);
            if(trieNode == null) {
                trieNode = new TrieNode();
                successors.put(currentChar, trieNode);
            }
            trieNode.add(word.substring(1));
        }
    }

    public int getPrefixCount (String prefix){
        if(prefix.isEmpty()) return prefixCount;
        else {
            Character currentChar = prefix.charAt(0);
            TrieNode trieNode = successors.get(currentChar);
            if(trieNode == null) return 0;

            return trieNode.getPrefixCount(prefix.substring(1));
        }
    }

    public int getWordCount(String word){
        if(word.isEmpty()) return wordCount;
        else {
            Character currentChar = word.charAt(0);
            TrieNode trieNode = successors.get(currentChar);
            if(trieNode==null) return 0;
            return trieNode.getWordCount(word.substring(1));
        }
    }
}
