class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                int test = hm.get(nums[i]);
                if (test + 1 > nums.length / 2) {
                    return nums[i];
                } else {
                    hm.put(nums[i], test + 1);
                }

            }
        }
        System.out.println(hm);
        return 0;
    }
}