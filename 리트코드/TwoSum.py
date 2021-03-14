class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        num2 = nums[:]; 
        answer = [] ; 
        
        for index,value in enumerate(num2):
            num2[index] = target - num2[index] ; 
        
        
        for index2, value2 in enumerate(num2):
            for index,value in enumerate(nums):
                if index2 == index : 
                    continue; 
                if num2[index2] == nums[index] :
                    answer.append(index2); 
                    answer.append(index); 
                    return answer; 
            
            
        
