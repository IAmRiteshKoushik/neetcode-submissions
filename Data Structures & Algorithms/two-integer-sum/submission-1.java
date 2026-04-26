class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int summation = nums[start] + nums[end];
            if (summation == target) {
                return new int[] {start, end};
            }
            else if (summation > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[] {-1, -1};
    }
}
