class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                rev.append(Character.toLowerCase(c));
            }
        }

        // As you have skipped a bunch of characters, 
        // reverse the value of string builder, and then 
        // compare them both as
        return rev.toString().equals(rev.reverse().toString());
    }
}
