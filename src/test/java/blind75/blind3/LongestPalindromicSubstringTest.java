package blind75.blind3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring len = new LongestPalindromicSubstring();
    private String str = "babad";

    @Test
    public void longestPalindrome() {
        String expected = "bab";
        String result = len.longestPalindrome(str);
        assertEquals(expected, result);
    }
}