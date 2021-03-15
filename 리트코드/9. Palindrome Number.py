#https://leetcode.com/problems/palindrome-number/
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        
        if x < 0 :
            return False;
        else:
            s = str(x); 
            list_s = list(s); 
            return list_s[:] == list_s[::-1]; 
        
