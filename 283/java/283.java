class Solution {
    public void moveZeroes(int[] nums) {
        int offset = 0;
        for (int i = 0; i < nums.length - offset; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - offset - 1; j++) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
                if (nums[i] == 0) {
                    i--;
                }
                offset++;
            }
        }
    }
}