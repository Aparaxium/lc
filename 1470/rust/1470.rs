impl Solution {
    pub fn shuffle(nums: Vec<i32>, n: i32) -> Vec<i32> {
        let mut vec = Vec::new();
        
        for i in 0..nums.len()/2 {
            vec.push(nums[i]);
            vec.push(nums[i + nums.len()/2]);
        } 
        
        return vec;
    }
}