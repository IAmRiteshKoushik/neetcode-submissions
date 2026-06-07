class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String c: operations){
            if (c.equals("C")) {
                stack.pop();
            } else if (c.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (c.equals("+")) {
                int curr = stack.pop();
                int prev = stack.peek();
                stack.push(curr);
                stack.push(curr + prev);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}