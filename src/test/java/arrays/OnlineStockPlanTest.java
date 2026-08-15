package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OnlineStockPlanTest {

    private OnlineStockPlan onlineStockPlan;


    @BeforeEach
    public void setUp() {
        onlineStockPlan = new OnlineStockPlan();
    }

    @AfterEach
    public void tearDown() {
        onlineStockPlan = null;
    }

    @Test
    public void testNext() {
        Assertions.assertEquals(1, onlineStockPlan.next(100));
        Assertions.assertEquals(1, onlineStockPlan.next(80));
        Assertions.assertEquals(1, onlineStockPlan.next(60));
        Assertions.assertEquals(2, onlineStockPlan.next(70));
    }
}
