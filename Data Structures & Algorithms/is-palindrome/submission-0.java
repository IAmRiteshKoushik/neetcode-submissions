class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] str = s.toCharArray();
        int start = 0; 
        int end = str.length - 1;

        while (start < end) {
            if (!isAlpha(str[start])) {
                start++;
                continue;
            }
            if (!isAlpha(str[end])) {
                end--;
                continue;
            }

            if (str[start] == str[end]) {
                start++;
                end--;
                continue;
            } else {
               return false; 
            }
        }
        return true;
    }

    private boolean isAlpha(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }
}
