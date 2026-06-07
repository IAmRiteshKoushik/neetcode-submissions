class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for(char c: s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                continue;
            } else {
                if (stack.isEmpty()){
                    return false;
                }
            }

            if (c == ')' && stack.peek() != '(') {
                return false;
            }
            if (c == '}' && stack.peek() != '{') {
                return false;
            } 
            if (c == ']' && stack.peek() != '[') {
                return false;
            }

            stack.pop();
        }
        return true;
    }
}
