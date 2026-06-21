class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        while(k > 0) {
            k--;
            int temp = nums[n - 1];
            // Shifting
            for(int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            // Slotting in the last value
            nums[0] = temp;
        }
    }
}