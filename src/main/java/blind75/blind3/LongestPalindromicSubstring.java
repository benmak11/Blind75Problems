package blind75.blind3;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String result = "";
        int reslen = 0;
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            //odd length
            int left = i;
            int right = i;
            while (left >= 0 && right < n && arr[left] == arr[right]) {
                if ((right - left + 1) > reslen) {
                    result = s.substring(left, right + 1);
                    reslen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        for (int i = 0; i < n; i++) {
            //even length
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < n && arr[left] == arr[right]) {
                if ((right - left + 1) > reslen) {
                    result = s.substring(left, right + 1);
                    reslen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return result;
    }
}
