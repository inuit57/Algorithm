```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    // sum : 현재까지 합계, cnt : 넣은 숫자 갯수, index : arr 배열의 index값
    public int dp(int sum , int[] arr, int cnt , int index , int K){

        if( index == arr.length) {
            if( cnt == 3 &&  sum > 0 && sum % K == 0 ){
                System.out.println("sum : " + sum);
                return 1; 
            } 
            else return 0; 
        }

        if( cnt == 3 ){
            if( sum > 0 && sum % K == 0 ){
                System.out.println("sum : " + sum); 
                return 1; 
            } 
            else return 0 ; 
        }

        return dp(sum + arr[index], arr, cnt + 1, index+1 , K)  +   // 넣은 경우
                dp(sum, arr, cnt , index+1 , K);  // 넣지 않은 경우 
    }

    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        
        answer = dp(0 , arr, 0 , 0 , K); 
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        //int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2,3,4};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
```

- DP는 역시 복습을 좀 해두는 게 좋을 것 같다. 
- 방향 자체는 맞게 잡았는데 구현에서 애를 좀 먹네  
