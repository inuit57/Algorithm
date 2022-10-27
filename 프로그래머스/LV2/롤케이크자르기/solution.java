import java.util.*; 

//https://school.programmers.co.kr/learn/courses/30/lessons/132265
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        HashMap<Integer, Integer> map2 = new HashMap<>(); 
        for(int i=0; i<topping.length ; i++){
            map.put(topping[i], map.getOrDefault(topping[i],0)+1);  
        }
        
        for(int i=0 ; i< topping.length ; i++ ){
            int out = topping[i]; 
            map2.put(out, map2.getOrDefault(out,0)+1); 
            int currCnt = map.get(out); 
            if( currCnt == 1) map.remove(out); 
            else map.put(out, currCnt -1); 
            
            if( map.size() == map2.size() ) answer ++; 
        }
        
        
        
        return answer;
    }
}
