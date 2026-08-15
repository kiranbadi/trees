package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchSuggestionSystemTest {

    private SearchSuggestionSystem searchSuggestionSystem;

    @BeforeEach
    void setUp() {
        searchSuggestionSystem = new SearchSuggestionSystem();
    }

    @AfterEach
    void tearDown() {
        searchSuggestionSystem = null;
    }

    @Test
    void suggestedProducts() {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        List<List<String>> expected = List.of(
                List.of("mobile","moneypot","monitor"),
                List.of("mobile","moneypot","monitor"),
                List.of("mouse","mousepad"),
                List.of("mouse","mousepad"),
                List.of("mouse","mousepad")
        );
        Assertions.assertEquals(expected, searchSuggestionSystem.suggestedProducts(products, searchWord));
    }
}