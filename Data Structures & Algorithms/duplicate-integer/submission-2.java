class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();

        for(int num: nums) {
            if (ans.contains(num)) {
                return true; // collison
            } else {
                ans.add(num);
            }
        }
        return false;
    }
}