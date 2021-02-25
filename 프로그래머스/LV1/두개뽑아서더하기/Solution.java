import java.util.*; 
import java.util.ArrayList; 
import java.util.Collections;



//문제 정보
// https://programmers.co.kr/learn/courses/30/lessons/68644

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i< numbers.length ; i++){
            for(int j= i+1; j< numbers.length; j++){
                set.add(numbers[i]+numbers[j]); 
            }
        }
        
        List<Integer> list = new ArrayList<Integer>(set); 
        
        Collections.sort(list); 
        
        answer = new int[list.size()];
        
        int size=0;
        for(int temp : list){

          answer[size++] = temp;

        }
        
        return answer;
    }
}
