package blind75.blind2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {

    private LengthOfLongestSubstring length = new LengthOfLongestSubstring();
    private String testStr = "abcabcbb";

    @Test
    public void lengthOfLongestSubstring() {
        int expected = 3;
        int result = length.lengthOfLongestSubstring(testStr);
        assertEquals(expected, result);
    }
}