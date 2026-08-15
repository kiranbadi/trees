package matrixs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStocksTest {

    private BuyAndSellStocks buyAndSellStocks;

    @BeforeEach
    void setUp() {
        buyAndSellStocks = new BuyAndSellStocks();
    }

    @AfterEach
    void tearDown() {
        buyAndSellStocks = null;
    }

    @Test
    void maxProfit() {
        int[] prices1 = {1, 3, 2, 8, 4, 9};
        int fee1 = 2;
        assertEquals(8, buyAndSellStocks.maxProfit(prices1, fee1));

        int[] prices2 = {1, 3, 7, 5, 10, 3};
        int fee2 = 3;
        assertEquals(6, buyAndSellStocks.maxProfit(prices2, fee2));

        int[] prices3 = {1};
        int fee3 = 0;
        assertEquals(0, buyAndSellStocks.maxProfit(prices3, fee3));

        int[] prices4 = {1, 2};
        int fee4 = 0;
        assertEquals(1, buyAndSellStocks.maxProfit(prices4, fee4));

        int[] prices5 = {2, 1};
        int fee5 = 0;
        assertEquals(0, buyAndSellStocks.maxProfit(prices5, fee5));
    }
}