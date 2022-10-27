import java.util.*; 

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        // 문제를 잘 보자. 내가 잘못 이해했다.
        // 컨베이어 벨트에는 1,2,3,4,5... 순서 
        
        // input으로 주어지는 것은 싣는 순서다.
        
        Stack<Integer> stk = new Stack<>();         
        for(int i =0 ; i< order.length ; i++){
            if( i+1 != order[answer] ){
                if( !stk.isEmpty() && stk.peek() == order[answer]){
                    stk.pop(); 
                    answer++;  
                    i--;
                }else{
                    stk.push(i+1);  
                }
            }else{
               
                answer ++; 
            }
        } 
        
        // 남은 스택 처리하기 
        while(!stk.isEmpty()){
            if( order[answer] == stk.pop()){
                answer ++; 
             
            }else{
                break;
            }
        }
        
        return answer;
    }
}
