package objects;

public class TrieNode {

    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode() {
        this.children = new TrieNode[26]; // 26 letters in the English alphabet
        this.isEndOfWord = false;
    }
}
