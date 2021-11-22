class Solution
{
public:
    vector<vector<string>> groupAnagrams(vector<string> &strs)
    {
        unordered_map<string, vector<string>> map;
        //list to hold the results
        vector<vector<string>> ret;

        //loop through the list of strings
        for (string &s : strs)
        {
            //temp copy to sort
            string temp = s;
            //sort the temp copy
            sort(temp.begin(), temp.end());
            //add the string ot the map using the sorted key
            map[temp].push_back(s);
        }

        //loop through the map and add the lists to a list
        for (auto i : map)
        {
            ret.push_back(i.second);
        }
        //return the list
        return ret;
    }
};