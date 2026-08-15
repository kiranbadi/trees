package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    private Trie trie;

    @BeforeEach
    void setUp() {
        trie = new Trie();
    }

    @AfterEach
    void tearDown() {
        trie = null;
    }

    @Test
    void insert() {
        String word = "apple";
        trie.insert(word);
        Assertions.assertTrue(trie.search(word));
    }

    @Test
    void search() {
        String word = "apple";
        trie.insert(word);
        Assertions.assertTrue(trie.search(word));
        Assertions.assertFalse(trie.search("app"));
    }

    @Test
    void startsWith() {
        String word = "apple";
        trie.insert(word);
        Assertions.assertTrue(trie.startsWith("app"));
        Assertions.assertFalse(trie.startsWith("banana"));
    }
}