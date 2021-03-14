// https://leetcode.com/problems/two-sum/submissions/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        vector<int> num2(nums.size()) ; 
        vector<int> ans ; 
        for(int i = 0 ; i< nums.size() ; i++){
            num2[i] = target -nums[i]  ; 
            //cout<<num2[i] <<endl; 
        }
        
        for(int i =0 ; i< num2.size() ; i++){
            for(int j = 0 ; j< nums.size() ; j++){
                if(i == j) continue;  // [3,2,4] , 6 일 때 [0,0]을 답으로 멍청하게 내놓지 않게끔.. 
                if(num2[i] == nums[j]){
                    //cout<< num2[i] << "," <<nums[j] <<endl; 
                    ans.push_back(i); 
                    ans.push_back(j); 
                    
                    return ans; 
                }
            }
        }
        return ans; 
    }
};
