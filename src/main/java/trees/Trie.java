package trees;

/*
A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.

Implement the Trie class:

    Trie() Initializes the trie object.
    void insert(String word) Inserts the string word into the trie.
    boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
    boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.



Example 1:

Input
["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
Output
[null, null, true, false, true, null, true]

Explanation
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple");   // return True
trie.search("app");     // return False
trie.startsWith("app"); // return True
trie.insert("app");
trie.search("app");     // return True



Constraints:

    1 <= word.length, prefix.length <= 2000
    word and prefix consist only of lowercase English letters.
    At most 3 * 104 calls in total will be made to insert, search, and startsWith.

 */

import objects.TrieNode;

public class Trie {

    private final TrieNode root;
    public Trie() {
        root =  new TrieNode();
    }


    /**
     * Inserts a word into the trie.
     * @param word The word to be inserted.
     *             Start at root
     *     ↓
     * For each character
     *     ↓
     * Convert char → index
     *     ↓
     * Does child exist?
     *    /        \
     *  No         Yes
     *  ↓           ↓
     * Create      Reuse
     *    \        /
     *     ↓
     * Move to child
     *     ↓
     * After last character
     *     ↓
     * isEndOfWord = true
     */
    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    /*
    Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
                     ┌───────────────────┐
                 │ search(word)       │
                 └─────────┬─────────┘
                           ↓
                 ┌───────────────────┐
                 │ current = root    │
                 └─────────┬─────────┘
                           ↓
                 ┌───────────────────┐
                 │ Get next character│
                 │ c from word       │
                 └─────────┬─────────┘
                           ↓
                 ┌───────────────────┐
                 │ index = c - 'a'   │
                 └─────────┬─────────┘
                           ↓
               ┌─────────────────────────┐
               │ current.children[index] │
               │       == null ?         │
               └────────────┬────────────┘
                         /     \
                      YES       NO
                       ↓         ↓
               ┌───────────┐  ┌────────────────────┐
               │return false│  │ Move to child     │
               └───────────┘  │ current =         │
                              │ children[index]    │
                              └─────────┬──────────┘
                                        ↓
                              ┌────────────────────┐
                              │ More characters in │
                              │ word?              │
                              └─────────┬──────────┘
                                    /       \
                                  YES        NO
                                   ↓          ↓
                            Process next   ┌───────────────────────┐
                            character      │return current.isEndOfWord│
                                   ↑       └───────────────────────┘
                                   │
                                   └────────────
     */

    public boolean search(String word){
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    /*
    Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
                     ┌───────────────────┐
                 │ startsWith(prefix)│
                 └─────────┬─────────┘
                           ↓
                 ┌───────────────────┐
                 │ current = root    │
                 └─────────┬─────────┘
                           ↓
                 ┌───────────────────┐
                 │ Get next character│
                 │ c from prefix     │
                 └─────────┬─────────┘
                           ↓
                 ┌───────────────────┐
                 │ index = c - 'a'   │
                 └─────────┬─────────┘
                           ↓
               ┌─────────────────────────┐
               │ current.children[index] │
               │       == null ?         │
               └────────────┬────────────┘
                         /     \
                      YES       NO
                       ↓         ↓
               ┌───────────┐  ┌────────────────────┐
               │return false│  │ Move to child     │
               └───────────┘  │ current =         │
                              │ children[index]    │
                              └─────────┬──────────┘
                                        ↓
                              ┌────────────────────┐
                              │ More characters in │
                              │ prefix?            │
                              └─────────┬──────────┘
                                    /       \
                                  YES        NO
                                   ↓          ↓
                            Process next   ┌───────────┐
                            character      │return true│
                                   ↑       └───────────┘
                                   │
                                   └────────────
     */

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
}
