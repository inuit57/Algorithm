//https://programmers.co.kr/learn/courses/30/lessons/42746?language=java                  
//정렬함수를 만들어서 처리해야 한다. 
// 맨앞의 숫자부터 비교해서 큰 순서대로 정렬해야 한다. 
// 1) 첫자리를 비교해서 큰 놈이 앞으로 온다. 
// 2) 첫자리가 같은 경우 다음 자리를 비교해서 큰 놈이 앞으로 온다. 
// 3) 차이가 날 때까지 반복한다. 
// 4) 만약 다음 자리가 없다면 없는 놈을 앞으로 놓는다. 

// 9999 vs 90 을 생각해본다. 9999가 먼저 오는게 맞다. 
// 9 vs 9999 를 생각해본다. 상관없다. 
// 5 vs 9999 를 생각해본다. 9999가 앞으로 와야 한다. 
// 999 vs 9998 을 생각해본다. 999가 앞으로 와야 한다. 
// 30 vs 3 : 3이 앞으로 와야 한다. 
    

// 일반적인 문자열 정렬로 처리하는 것도 가능할 것 같다. 
// charAt() 을 사용하면 0 ~9 까지 처리가 된다. 
// 그냥 sort()를 돌리면 반대로 되길래 reverse로 방향 바꿔서 해봤더니 
//  30 vs 3 같은 것을 30을 더 앞으로 놓아버린다. 
// 이를 고치려면 커스텀 sort 함수를 구현해야 할텐데 그걸 좀 고민해봐야 할듯. 

import java.util.* ; 

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr ; 
   
        arr = new String[numbers.length]; 
        for(int i = 0 ; i< numbers.length ; i++){
            arr[i] = ""+numbers[i] ; 
        }   
       
        Arrays.sort(arr , Collections.reverseOrder());  // 여기에 커스텀 sort 함수 넣기. 
        
        for(int i = 0 ; i< arr.length ; i++){
            answer += arr[i] ; 
        }
        
        return answer;
    }
}
