import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelegramBotTests {

    @Test
    public void testPositive1() {
        assertTrue(true);
    }
    @Test
    public void testPositive2() {
        assertTrue(true);
    }
    @Test
    public void testPositive3() {
        assertTrue(true);
    }
    @Test
    public void testNegative1() {
        assertTrue(false);
    }
    @Test
    public void testNegative2() {
        assertTrue(false);
    }


    @Test
    @Disabled("Waiting for fix Jira-666-Issue")
    public void testPositive13() {
        assertTrue(true);
    }
    @Test
    @Disabled
    public void testPositive14() {
        assertTrue(true);
    }
}
