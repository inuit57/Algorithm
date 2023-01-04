import java.util.* ; 

class Solution {
    int result = Integer.MAX_VALUE; 
    
    public int solution(int storey) {
        int answer = 0;
        
        getCount(storey, 0); 
        answer = result ; 
        return answer;
    }
    
    public void getCount(int num , int curr){
        //System.out.println( "num : " + num +", curr : " + curr); 
        if(num /10 != 0 ){                 
            getCount(num/10, curr + num%10 ); 
            getCount(num/10+1, curr + (10 - num%10)) ;
        }else{
            // 마지막에도 %10 처리를 해줘야 하네요. 
            curr += Math.min( num%10, 11-num%10); 
            
            result = Math.min(curr ,result); 
        }
        
    }
}
