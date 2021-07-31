```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;

        int s1_len = s1.length(); 
        int s2_len = s2.length() ; 

        if( s1_len > s2_len) { 
            // do nothing 
            System.out.println("s1이 더 길다.");
        }else{ 

            String tmp = s1; 
            s1 = s2 ; 
            s2 = tmp ; 
            //서로 바꿔주도록 하자. 

            int len_tmp  = s1_len; 
            s1_len = s2_len ; 
            s2_len = len_tmp ; 
            
        }
   
        // 뒤에 붙이는 경우를 먼저 생각하자. 
        for(int i = 0 ; i < s2_len ; i++){ 
            if( s1.substring(s1_len - (s2_len - i)).equals(s2.substring(0, s2_len-i))){
                answer = s1_len  + i ; 
                break; 
            }
        }

        // 앞에 붙이는 경우의 수. 
        for(int i = 0 ; i< s2_len ; i++) { 
            if( s1.substring(0, s2_len - i).equals(s2.substring(i))){
                answer = s1_len  + i ; 
                break; 
            }
        }

        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        // String s1 = new String("ababc");
        // String s2 = new String("abcdab");

        String s1 = new String("ababc");
        String s2 = new String("ababc");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
```


- 쉬운 문제 
- subString() 함수만 사용할 줄 알면 굉장히 쉽게 풀리는 문제. 
