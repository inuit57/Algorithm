```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int answer = 99999;
        
        Arrays.sort(arr); 
        
        int len = arr.length ; 
        
        for(int i= 0 ; i< len ; i++){
            System.out.print(arr[i] + " " ); 
        }
        System.out.println(""); 

        // 정렬한 뒤, 슬라이드로 하나씩 밀면서 가도록 처리하면 된다. 
        for(int i =0 ; i<= len-K ; i++){
            System.out.println ( "i+K-1 : " + arr[i+K-1])  ; 
            System.out.println ( "i : " + arr[i]) ; 
            answer = Math.min(answer , (arr[i+K-1] - arr[i] )) ; 
            System.out.println(answer); 
        }
            
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {9, 11, 9, 6, 4, 19 };
        //int[] arr = {9, 9, 9, 9, 9, 9 };
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }
}
```

- 슬라이딩 윈도우 방식으로 해결. 
