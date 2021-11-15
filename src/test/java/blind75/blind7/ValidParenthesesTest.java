package blind75.blind7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    private ValidParentheses service = new ValidParentheses();
    private String test = "()", test2 = "()[]{}", test3 = "(]";

    @Test
    public void testIsValid() {
        boolean result = service.isValid(test);
        assertTrue(result);
    }

    @Test
    public void testIsValid2() {
        boolean result = service.isValid(test2);
        assertTrue(result);
    }

    @Test
    public void testIsValid3() {
        boolean result = service.isValid(test3);
        assertFalse(result);
    }
}