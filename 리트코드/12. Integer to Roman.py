# https://leetcode.com/problems/integer-to-roman/submissions/
class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        # 1 : I
        # 4 : IV
        # 5 : V
        # 9 : IX
        # 10 : X
        # 40 : XL
        # 50 : L
        # 90 : XC
        # 100 : C
        # 400 : CD
        # 500 : D
        # 900 : CM
        
        str = ""; 
        
        while(num > 0):
            if(num >= 1000):
                num -= 1000; 
                str+="M"; 
            elif(num>=100):
                if(num>=900):
                    num-=900;
                    str+="CM";
                elif(num>=500):
                    num-=500;
                    str+= "D"; 
                elif(num>=400):
                    num-=400;
                    str+="CD";
                else:
                    num-=100;
                    str+="C"; 
            elif(num>=10):
                if(num>=90):
                    num-=90; 
                    str+="XC";
                elif(num>=50):
                    num-=50; 
                    str+="L"; 
                elif(num>=40):
                    num-=40;
                    str+="XL";
                else:
                    num-=10;
                    str+="X"; 
            elif(num>=1):
                if(num>=9):
                    num-=9; 
                    str+="IX"; 
                elif(num>=5):
                    num-=5;
                    str+="V";
                elif(num>=4):
                    num-=4;
                    str+="IV"; 
                else:
                    num-=1;
                    str+="I"; 
        
        return str;
                    
                    
