```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;

        int max_len = 2; 
        int curr_len = 1 ; 

        for(int i = 0 ; i < arr.length-1 ; i++){
            if( arr[i] < arr[i+1] ){
                curr_len ++ ; 
                max_len = Math.max(max_len , curr_len);                 
            }else{
                curr_len = 1; 
            }
        }

        answer = max_len == 2 ? 1 : max_len; 
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};

        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
```

- 어렵지는 않은 문제. 
- 길이 계산을 0 이 아니라 1부터 해줘야한다는 것만 알면 쉽게 풀 수 있다. 
