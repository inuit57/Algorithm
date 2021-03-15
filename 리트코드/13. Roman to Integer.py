#https://leetcode.com/problems/roman-to-integer/submissions/
class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum = 0 ; 
        list_s = list(s); 
        for index, value in enumerate(list_s):
            if value == 'I':
                sum+=1; 
            elif value == 'V':
                sum+=5; 
                if index>0 and list_s[index-1]=='I': 
                    sum-=2; 
            elif value == 'X' :
                sum+=10; 
                if index>0 and list_s[index-1]=='I': 
                    sum-=2; 
            elif value == 'L' :
                sum+=50; 
                if index>0 and list_s[index-1]=='X': 
                    sum-=20; 
            elif value == 'C' :
                sum+=100; 
                if index>0 and list_s[index-1]=='X': 
                    sum-=20; 
            elif value == 'D' :
                sum+=500; 
                if index>0 and list_s[index-1]=='C': 
                    sum-=200; 
            elif value == 'M' :
                sum+=1000; 
                if index>0 and list_s[index-1]=='C': 
                    sum-=200; 
            
        return sum; 
