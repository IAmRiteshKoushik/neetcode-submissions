class Solution {
    public int search(int[] nums, int target) {
        return bSearch(0, nums.length - 1, nums, target);
    }

    public int bSearch(int l, int r, int[] nums, int target) {
        if (l > r) return -1;
        int m = l + (r - l) / 2;

        if (nums[m] == target) return m;
        return (nums[m] < target) ? 
            bSearch(m + 1, r, nums, target) : 
            bSearch(l, m - 1, nums, target);
    }
}
