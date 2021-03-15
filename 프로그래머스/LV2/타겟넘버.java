//https://programmers.co.kr/learn/courses/30/lessons/43165

class Solution {
    public int check(int[] numbers,int index, int target, int sum  ){ 
      //바보같이 여기에서 index == number.length-1 을 검사하고 + 시킨 결과를 비교해서 -시킨 결과를 안 더해줘서 결과가 다르게 나왔다. 
      
        if (index == numbers.length ){ //1개 남았을 때  
            if (sum == target){              
                return 1; 
            }else{
                return 0; 
            }       
        }
        return check(numbers,index+1,target,sum+numbers[index] )+
            check(numbers,index+1, target,sum-numbers[index] ); //재귀로 다 확인. 
      // + 해주는 경우, - 해주는 경우 모두 탐색. 
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
             
          answer += check(numbers,0, target,0); 
        
        return answer;
    }
}
