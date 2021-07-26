```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
        int answer = 1;
        
        int curr_len = 0 ; 
        String curr_str =""; 
        
        for(int i = 0 ; i< words.length ; i++){ 
            
            // 이번 줄에 처음 적는 경우. 
            if( curr_len == 0 ) { 
                curr_len += words[i].length() ; 
                
                if(curr_len +1  >= K) { 
                    // 한번에 K 길이만큼 들어온 경우 
                    curr_len = 0 ; 
                    answer ++ ; //다음줄로 넘기기       
                }else{
                    curr_len ++ ; //다음 글자를 받기위해서 +1 (_) 
                }
            }else{
                curr_len += words[i].length(); 
                if(curr_len > K){
                    curr_len = words[i].length() + 1; // 새로운 줄에 적어주기 
                    answer ++ ;  
                }else if( curr_len +1 == K){
                    curr_len = 0 ; 
                    answer ++ ; 
                }else{
                    curr_len ++; 
                }
            }               
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int K = 10;
         String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        //String[] words = {new String("abc")} ;
        int ret = sol.solution(K, words);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
        
    }
}
```
