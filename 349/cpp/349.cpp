class Solution
{
public:
    vector<int> intersection(vector<int> &nums1, vector<int> &nums2)
    {
        unordered_map<int, bool> map;
        vector<int> result;
        for (int &num : nums1)
        {
            if (!map[num])
                map[num] = true;
        }
        for (int &num : nums2)
        {
            if (map[num] == true)
                result.push_back(num);
            map[num] = false;
        }
        return result;
    }
};