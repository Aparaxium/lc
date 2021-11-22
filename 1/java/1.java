class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap();
        
        for(int i = 0; i < nums.length; ++i) {
            if(hm.containsKey(target - nums[i])) {
                int[] answer = {i, hm.get(target - nums[i])};
                return answer;
            }
            hm.put(nums[i], i);
        }
        //never reached due to constraints, without the constraints this is bad.
        return null;
    }
}