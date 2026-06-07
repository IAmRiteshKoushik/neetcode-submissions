class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();

        for(String c: operations){
            if (c.equals("C")) {
                res -= stack.pop();
            } else if (c.equals("D")) {
                stack.push(stack.peek() * 2);
                res += stack.peek();
            } else if (c.equals("+")) {
                int curr = stack.pop();
                int prev = stack.peek();
                stack.push(curr);
                stack.push(curr + prev);
                res += stack.peek();
            } else {
                stack.push(Integer.parseInt(c));
                res += stack.peek();
            }
        }
        return res;
    }
}