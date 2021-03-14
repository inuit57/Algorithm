#https://leetcode.com/problems/reverse-integer/submissions/
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        s = str(x) ; 
        list_str = list(s); 
        list_str.reverse();                 

        if x >= 0:
            s = "".join(list_str); 
            
            if int(s) > (2<<31 -1):
                #print("check"); 
                return 0; 
            
            return int(s); 
        else:
            # "-"기호를 제거하고 reverse()를 하고 "-"를 다시 앞에 붙여야한다. 
            s = "".join(list_str[:-1]); 
            
            # print(2<<30); 
            if int(s) > (2<<30) :  
                return 0; 
            return -int(s); 
        
        
        
