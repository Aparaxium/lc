impl Solution {
    pub fn running_sum(nums: Vec<i32>) -> Vec<i32> {
        let mut vec = Vec::new();
        let mut sum = 0;
        
        for n in 0..nums.len() {
            sum += nums[n];
            vec.push(sum);
        }
        
        return vec;
    }
}