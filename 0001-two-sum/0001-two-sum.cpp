class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> mp;
        for(int i = 0;i < nums.size();i++){
            int b = target - nums[i];
            if(mp.contains(b)) return {mp[b],i};
            mp[nums[i]] = i;
        }
        return {0,0};
    }
};